package LeetCode;
import java.util.*;

public class InOrderTraversal 
{
	public List<Integer>inorderTraversal(TreeNode root)
    {
        List<Integer> ret = new ArrayList<Integer>();
        if(root!=null)
        {
            inorder(root, ret);
        }
        return ret;
    }
    
    public void inorder(TreeNode root, List<Integer> ret)
    {
        if(root!=null)
        {
            inorder(root.left, ret);
            ret.add(root.val);
            inorder(root.right, ret);
        }
    }
	
	public List<Integer> inorderTraversalIter(TreeNode root) 
    {
        List<Integer> ret = new ArrayList<Integer>();
        if(root!=null)
        {
            Stack<TreeNode> stack = new Stack<TreeNode> ();
            TreeNode node = root;
            while (node!=null)
            {
                stack.push(node);
                node = node.left;
            }
            while(!stack.isEmpty())
            {
                TreeNode temp = stack.pop();
                ret.add(temp.val);
                if(temp.right!=null)
                    node = temp.right;
                
                while(node!=null)
                {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
        return ret;
    }
}
