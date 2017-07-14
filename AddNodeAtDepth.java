package LeetCode;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
 
public class AddNodeAtDepth 
{
    public TreeNode addOneRow(TreeNode root, int v, int d) 
    {
        if (d==1)
        {
            TreeNode newroot = new TreeNode(v);
            newroot.left = root;
            return newroot;
        }
        int targd = d;
        traverseTree(root, v, 1, targd);
        return root;
    }
    
    public void traverseTree(TreeNode root, int v, int d, int targd)
    {
        if(root==null)
        {
            return;
        }
        if (d == targd-1)
        {
            TreeNode nodeL = new TreeNode(v);
            TreeNode nodeR = new TreeNode(v);
            nodeL.left = root.left;
            nodeR.right = root.right;
            root.left = nodeL;
            root.right = nodeR;
            return;
        }
        
        traverseTree(root.left, v, d+1, targd );
        traverseTree(root.right, v, d+1, targd);
        return;
    }
}