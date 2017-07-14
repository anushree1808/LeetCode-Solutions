package LeetCode;
import LeetCode.AddNodeAtDepth;

public class MergeBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return tree(t1, t2);
    }
    
    public TreeNode tree(TreeNode t1, TreeNode t2)
    {
        if (t1==null && t2==null)
        {
            return null;
        }
        TreeNode node;
        if(t1!=null && t2!=null) 
        {
            node = new TreeNode(t1.val+t2.val);
            node.left = tree(t1.left, t2.left);
            node.right = tree(t1.right, t2.right);
            return node;
        }
        else if(t1==null)
        {
            node = new TreeNode(t2.val);
            node.left = tree(null, t2.left);
            node.right = tree(null, t2.right);
            return node;
        }
        else
        {
            node = new TreeNode(t1.val);
            node.left = tree(t1.left, null);
            node.right = tree(t1.right, null);
            return node;
        }
        
    }
}