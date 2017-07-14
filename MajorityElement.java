package LeetCode;

public class MajorityElement 
{
	public static void main(String args[])
	{
		int[] arr1 = {1, 2, 1, 1, 1, 3};
		int[] arr2 = {1, 1, 2, 2, 2, 0};
		MajorityElement obj = new MajorityElement();
		System.out.println(obj.majorityElement(arr1));
		System.out.println(obj.majorityElement(arr2));
	}
	
	public int majorityElement(int[] nums) 
    {
        int cand = candidate(nums);
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==cand)
                count+=1;
            if (count > nums.length/2)
                break;
        }
        if (count>nums.length/2)
        	return cand;
        else
        	return Integer.MIN_VALUE;
    }
    
    public int candidate(int nums[])
    {
        int count=1;
        int maj_index = 0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[maj_index]==nums[i])
                count+=1;
            else
                count-=1 ;
            if(count==0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return nums[maj_index];
    }
}
