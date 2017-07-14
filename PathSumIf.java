package LeetCode;
import LeetCode.AddNodeAtDepth;

public class PathSumIf {
    public boolean hasPathSum(TreeNode root, int sum) 
    {
        return curSum(root, sum, 0);   
    }
    
    public boolean curSum(TreeNode root, int sum, int cursum)
    {
        if (root == null)
            return false;
        
        cursum += root.val;
        if (root.left==null && root.right==null)
        {
            if (cursum==sum)
                return true;
            else
                return false;
        }
        boolean ret = curSum(root.left, sum, cursum) || curSum(root.right, sum, cursum);
        cursum -= root.val;
        return ret;
    }
}
