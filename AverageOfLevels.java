package LeetCode;

import java.util.*;

public class AverageOfLevels 
{
	public List<Double> averageOfLevels(TreeNode root) 
    {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Double> list = new ArrayList<Double>();
        if(root==null)
            return list;
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            double run_sum = 0, i=0;
            while(i<size)
            //for(i=0; i<size; i++)
            {
                TreeNode temp = queue.poll();
                run_sum += temp.val;
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
                i+=1;
            }
            list.add(run_sum/size);
        }
        return list;
    }
	
	public List<Integer> largestValuesEveryRow(TreeNode root) 
    {
        List<Integer> list = new ArrayList<Integer>();
        if(root!=null)
        {
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            q.add(root);
            while(!q.isEmpty())
            {
                int size = q.size();
                int max = Integer.MIN_VALUE;
                /*for(int i=0; i<size; i++)
                {
                    
                }*/
                while(size>0)
                {
                    TreeNode temp = q.poll();
                    if(temp.val>max)
                    {
                        max = temp.val;
                    }
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                    size--;
                }
                list.add(max);
            }
        }
        return list;
    }
}
