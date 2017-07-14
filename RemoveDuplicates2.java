package LeetCode;

/*
 * What if duplicates are allowed at most twice?
 * For example,
 * Given sorted array nums = [1,1,1,2,2,3],
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3.
 * It doesn't matter what you leave beyond the new length.
 */

public class RemoveDuplicates2 
{
	public int removeDuplicates1(int[] nums) 
    {
        if(nums.length==0)
            return 0;
        int len = 1;
        int cur_num = nums[0];
        int num_times = 1;
        for (int i=1; i<nums.length; i+=1)
        {
            if(cur_num==nums[i])
            {
                num_times += 1;
            }
            else
            {
                cur_num = nums[i];
                num_times = 1;
            }
            if(num_times<3)
            {
                nums[len] = nums[i];
                len+= 1;
            }
        }
        return len;
    }
    
    public int removeDuplicates(int[] nums)
    {
        int i=0;
        for(int n : nums)
        {
            if(i<2 || nums[i-2]<n)
                nums[i++] = n;
        }
        return i;
    }
}
