package LeetCode;

import java.util.ArrayList;

public class ValidateBST 
{
	ArrayList<Integer>inorder = new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) 
    {
        if (root==null)
        {
            return true;
        }
        inorder_trav(root);
        for (int i=0; i<inorder.size()-1; i++)
        {
            if(inorder.get(i)>= inorder.get(i+1))
                return false;
        }
        return true;
    }
    
    public void inorder_trav(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder_trav(root.left);
        inorder.add(root.val);
        inorder_trav(root.right);
    }
}
