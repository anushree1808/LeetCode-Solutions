package LeetCode;
import LeetCode.AddNodeAtDepth;

public class Tilt {
    int sum=0;
    public int findTilt2(TreeNode root) 
    {
        tilt(root); 
        return sum;
    }
    
    public int tilt(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int l = tilt(root.left);
        int r = tilt(root.right);
        sum += Math.abs(l-r);
        return l+r+root.val;
    }
    
    public int findTilt(TreeNode root) {
        if (root == null) return 0;
        int curVal = 0;
        curVal = Math.abs(sumSubTree(root.left) - sumSubTree(root.right));
        return curVal + findTilt(root.left) + findTilt(root.right);
    }

    private int sumSubTree(TreeNode root) {
        if (root == null) return 0;
        return root.val + sumSubTree(root.left) + sumSubTree(root.right);
    }
}
