package LeetCode;

public class ThirdMax 
{
	public static void main(String args[])
	{
		int [] arr = {1,-2147483648,2}; // fails for this case
		ThirdMax obj = new ThirdMax();
		int num = obj.thirdMax(arr);
		System.out.println(num);
	}
	
	public int thirdMax(int[] nums) {
        int fMax=nums[0];
        int sMax=Integer.MIN_VALUE;
        int tMax=Integer.MIN_VALUE;
        int count=1;
        for(int n : nums){
            if(n<tMax || n==fMax || (n==sMax && count>1) || (n==tMax && count>2)) continue;
            count++;
            if(n>fMax){
                tMax=sMax;
                sMax=fMax;
                fMax=n;
                continue;
            }
            if(n<fMax && n>sMax){
                tMax=sMax;
                sMax=n;
                continue;
            }
            if(n>tMax){
                tMax=n;
                continue;
            }
        }
        
        return count>2?tMax:fMax;
    }
	
	public int thirdMax_another(int nums[])
    {
        int lenn=nums.length;
        if(lenn==1)
        {
            return nums[0];
        }
        if(lenn==2)
        {
            return Math.max(nums[0], nums[1]);
        }
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for(Integer n : nums)
        {
            if(n.equals(first) || n.equals(second) || n.equals(third))
                continue;
            if(first==null || n > first)
            {
                third = second;
                second = first;
                first = n;
            }
            else if(second==null||n>second)
            {
                third = second;
                second = n;
            }
            else if (third==null || n>third)
            {
                third=n;
            }
        }
        return third==null?first:third;
    }
	
	public int thirdMax_mine(int[] nums) 
    {
        int n = nums.length;
        if(n==1)
        {
            return nums[0];
        }
        else if (n==2)
        {
            return Math.max(nums[0], nums[1]);
        }
        else
        {
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;
            int change = 0;
            for(int i=0; i<n; i++)
            {
                if(nums[i]>first)
                {
                    third = second;
                    second = first;
                    first = nums[i];
                    change++;
                }
                else if(nums[i]>second && nums[i]!=first)
                {
                    third = second;
                    second = nums[i];
                    change++;
                }
                else if(nums[i]>=third && nums[i]!=second && nums[i]!=first)
                {
                    third = nums[i];
                    change++;
                }
                System.out.println(first+" "+second+" "+third);
            }
            System.out.println(change);
            if(change<3)//(third==Integer.MIN_VALUE)
                return first;
            return third;
        }
    }
}
