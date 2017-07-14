package LeetCode;
import LeetCode.AddNodeAtDepth;

public class MinDepth {
    public int minDepth(TreeNode root) 
    {
        if (root == null)
        {
            return 0;
        }
        int ldepth = minDepth(root.left);
        int rdepth = minDepth(root.right);
        
        if (ldepth==0 || rdepth==0)
        {
            //return ldepth+rdepth+1;
            return Math.max(ldepth, rdepth)+1;
        }
        
        /*if (ldepth < rdepth)
        {
            return 1+ldepth;
        }
        else
        {
            return 1+rdepth;
        }*/
        return Math.min(ldepth, rdepth)+1;
    }
}
