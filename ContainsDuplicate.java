package LeetCode;

import java.util.Arrays;

public class ContainsDuplicate 
{
    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i< nums.length; i++)
        {
            if (nums[i]==nums[i-1])
                return true;
        }
        return false;
    }
    
    public boolean containsDuplicate(int nums[])
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i < nums.length; i++)
        {
            if(nums[i] < min)
                min = nums[i];
            if(nums[i] > max)
                max = nums[i];
        }
        
        boolean hash [] = new boolean[max-min+1];
        for(int i=0; i<nums.length; i++)
        {
            if(hash[nums[i]-min])
                return true;
            hash[nums[i]-min] = true;
        }
        return false;
    }
}
