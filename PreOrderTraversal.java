package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal 
{
	public List<Integer> preorderTraversalIter(TreeNode root) 
    {
        List<Integer> ret = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null)
            return ret;
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode temp = stack.pop();
            ret.add(temp.val);
            if(temp.right!=null)
            {
                stack.push(temp.right);
            }
            if(temp.left!=null)
            {
                stack.push(temp.left);
            }
        }
        return ret;
    }
    
    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<Integer> ret = new ArrayList<Integer>();
        if (root==null)
            return ret;
        preorder(root, ret);
        return ret;
    }
    
    public void preorder(TreeNode root, List<Integer> ret)
    {
        if(root==null)
            return ;
        ret.add(root.val);
        preorder(root.left, ret);
        preorder(root.right, ret);
    }
}
