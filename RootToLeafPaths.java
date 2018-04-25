package LeetCode;
import java.util.*;

public class RootToLeafPaths 
{
	public List<String> binaryTreePaths1(TreeNode root) 
	{
        List<String> answer = new ArrayList<String>();
        if(root!=null) BTSearch(root, "", answer);
        return answer;
    }
    
    public void BTSearch(TreeNode root,String path,List<String> answer)
    {
        if(root.left == null && root.right == null) answer.add(path + root.val);
        if(root.left != null) BTSearch(root.left, path + root.val+ "->" , answer);
        if(root.right != null) BTSearch(root.right, path+root.val+ "->" , answer);
     }
    
    List<String> ret = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) 
    {
        if(root!=null)
        {
            int [] paths = new int[10000];
            printRecPath(root, paths,0);
        }
        return ret;
    }
    
    public void printRecPath(TreeNode root, int[] path, int len)
    {
        if(root==null)
        {
            return;
        }
        path[len] = root.val;
        len += 1;
        
        if(root.left==null && root.right==null)
        {
            printPath(path, len);
        }
        else
        {
            printRecPath(root.left,path,len);
            printRecPath(root.right, path, len);
        }
    }
    
    public void printPath(int[] path, int len)
    {
        StringBuilder str = new StringBuilder();
        str.append(path[0]);
        for(int i=1; i<len; i++)
        {
            str.append("->"+path[i]);
        }
        
        ret.add(str.toString());
    }

}
