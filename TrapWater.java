package LeetCode;

public class TrapWater 
{
	public int trap(int[] height) 
    {
        int water = 0;
        int len = height.length;
        if (len==0)
            return water;
        int [] left = new int[len];
        int [] right = new int[len];
        
        left[0] = height[0];
        for(int i=1; i<len; i++ )
        {
            left[i] = Math.max(left[i-1],height[i]);
        }
        
        right[len-1] = height[len-1];
        for(int i=len-2; i>=0; i--)
        {
            right[i] = Math.max(right[i+1], height[i]);
        }
        
        for(int i=0; i<len; i++)
        {
            water+= Math.min(right[i], left[i]) - height[i];
        }
        return (water<0)?0:water;
    }
	
	public int trap_fast(int[] height) 
	{
        if(height == null || height.length  == 0)
        {
            return 0;
        }
        
        int i = 0, j = height.length -1;
        int left_height = height[i], right_height = height[j], res = 0;
        while(i < j)
        {
            if(left_height <= right_height)
            {
                i++;
                if(height[i] < left_height)
                {
                    res += left_height - height[i];
                }else
                {
                    left_height = height[i];
                }
            }
            else
            {
                j--;
                if(height[j] < right_height)
                {
                    res += right_height - height[j];
                }
                else
                {
                    right_height = height[j];
                }
            }
        }
        return res;
        
    }
}
