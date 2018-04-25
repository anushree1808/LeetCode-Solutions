package LeetCode;
import java.util.*;

public class IsSymmetricTree 
{
	public boolean isSymmetricRec(TreeNode root) 
    {
        if(root==null)
            return true;
        return isMirror(root.left, root.right);
    }
    
    public boolean isMirror(TreeNode n1 , TreeNode n2)
    {
        if(n1==null && n2==null)
        {
            return true;
        }
        if(n1==null || n2==null)
        {
            return false;
        }
        return (n1.val==n2.val) && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
    }
    
    public boolean isSymmetricIter(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }
}
