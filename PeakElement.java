package LeetCode;

public class PeakElement 
{
	public int findPeakElement1(int[] nums) {
        int peak = nums.length-1;
        for(int i=0; i<nums.length-1; i++)
        {
            if (i==0 && nums[0] > nums[1])
            {
                peak = 0;
                break;
            }
            if(nums[i] > nums[i+1] && nums[i]> nums[i-1])
            {
                peak = i;
                break;
            }
        }
        return peak;
        
    }
    
    public int findPeakElement(int [] nums)
    {
        if (nums.length==0)
            return Integer.MAX_VALUE;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]<nums[i-1])
            {
                return i-1;
            }
        }
        
        return nums.length-1;
    }
}
