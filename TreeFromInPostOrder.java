package LeetCode;

public class TreeFromInPostOrder 
{
	int index = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) 
    {
        index = postorder.length-1;
        return build(inorder, postorder,0, inorder.length-1);
    }
    
    public TreeNode build(int [] in, int[] post, int l, int h)
    {
        if(l>h)
        {
            return null;
        }
        TreeNode node = new TreeNode(post[index]);
        index -=1;
        //return node;
        
        if(l==h)
            return node;
        
        int i = search(in, l, h, node.val);
        node.right = build(in,post,i+1,h);
        node.left = build(in,post,l,i-1);
        return node;
    }
    
    public int search(int a[], int strt, int end, int data)
    {
        int i;
        for (i=strt; i<=end ; i++)
        {
            if (a[i]==data)
                return i;
        }
        return i;
    }
}
