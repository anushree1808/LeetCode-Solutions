package LeetCode;

public class HeightBalancedBT 
{
	public boolean isBalanced(TreeNode root) 
    {
        if(root==null)
            return true;
        int lh = height(root.left); 
        int rh = height(root.right);
        
        return Math.abs(lh-rh)<2 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int height(TreeNode root)
    {
        if (root==null)
        {
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }
}
