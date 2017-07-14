package LeetCode;

public class LeftLeavesSum {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) 
    {
        summer(root);
        return sum;
    }
    
    public int summer(TreeNode root)
    {
        if (root==null)
        {
            return 0;
        }
        if (root.right==null && root.left==null)
        {
            return root.val;
        }
        int l = summer(root.left) ;
        summer(root.right);
        sum += l;
        return 0;
    }
}