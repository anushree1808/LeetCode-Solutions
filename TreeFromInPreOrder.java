package LeetCode;

public class TreeFromInPreOrder {
	int point = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        return build_tree(inorder, 0, inorder.length-1, preorder);
    }
    
    public TreeNode build_tree(int[] inorder, int low, int high, int[] preorder)
    {
        if(low > high)
        {
            return null;
        }
        int pivot = binary_search(inorder,low, high, preorder[point]);
        TreeNode root = new TreeNode(preorder[point]);
        point += 1;
        
        if(low == high)
        {
            return root;
        }
        
        root.left = build_tree(inorder,low, pivot-1,preorder);
        root.right = build_tree(inorder, pivot+1, high, preorder);
        return root;
    }
    
    
    
    public int binary_search(int [] inorder, int low, int high, int targ)
    {
        int i;
        for (i=low; i<=high; i++)
        {
            if (inorder[i]==targ)
            {
                break;
            }    
        }
        return i;
    }        
}

