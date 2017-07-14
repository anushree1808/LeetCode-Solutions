package LeetCode;

import LeetCode.AddNodeAtDepth;
public class SubTree {
    public boolean isSubtree(TreeNode s, TreeNode t) 
    {
        if (t==null)
        {
            return true;
        }
        if (s==null)
        {
            return false;
        }
        
        if(areIdentical(s,t))
        {
            return true;
        }
        
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    public boolean areIdentical(TreeNode s, TreeNode t)
    {
        if (s==null && t==null)
        {
            return true;
        }
        
        if (s==null || t==null)
        {
            return false;
        }
        
        return (s.val==t.val && areIdentical(s.right,t.right) && areIdentical(s.left, t.left));
    }
}
