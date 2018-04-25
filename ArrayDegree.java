package LeetCode;

import java.util.HashMap;

// https://leetcode.com/problems/degree-of-an-array/hints/
public class ArrayDegree {
    public int findShortestSubArray(int[] nums) 
    {
        if(nums==null || nums.length==0)
            return 0;
        HashMap<Integer, int[]> hmap = new HashMap<Integer, int[]>();
        for(int i=0; i<nums.length; i++)
        {
            if(hmap.containsKey(nums[i]))
            {
                int [] temp = hmap.get(nums[i]);
                temp[0] += 1;
                temp[2] = i;
            }
            else
            {
                hmap.put(nums[i], new int[] {1, i, i});
            }
        }
        int maxDegree = Integer.MIN_VALUE, res = 0;
        for(int [] value : hmap.values())
        {
            if(value[0] > maxDegree)
            {
                maxDegree = value[0];
                res = value[2]-value[1]+1;
            }
            else if (value[0] == maxDegree)
            {
                res = Math.min(value[2]-value[1]+1, res);
            }
        }
        return res;
    }
    
    public static void main(String args[])
    {
    	int[] nums = {2, 3, 2, 3, 4, 2, 1};
    	ArrayDegree obj = new ArrayDegree();
    	System.out.println(obj.findShortestSubArray(nums));
    	int[] nums2 = {2, 2, 2, 3, 4, 5, 1};
    	System.out.println(obj.findShortestSubArray(nums2));
    }
}
