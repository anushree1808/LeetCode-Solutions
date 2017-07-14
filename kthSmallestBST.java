package LeetCode;
import LeetCode.AddNodeAtDepth;

public class kthSmallestBST 
{
	    int num=1;
	    int value;
	    public int kthSmallest(TreeNode root, int k) 
	    {
	        inorder(root, k); 
	        return value;
	    }
	    
	    public void inorder(TreeNode root, int k)
	    {
	        
	        if(root==null)
	        {
	            return ;
	        }
	        
	        inorder(root.left,k);
	        if (num==k)
	        {
	           value = root.val;
	        }
	        num += 1;
	        inorder(root.right,k);
	    }
}

