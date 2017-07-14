package LeetCode;

/*Given an array with n objects colored red, white or blue, sort them so that objects of the same color 
 * are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.*/

public class CountColors {
    public void sortColors(int[] nums) 
    {
        int red_c = 0;
        int blue_c = 0;
        int white_c = 0;
        for (int i=0; i<nums.length; i++)
        {
            switch(nums[i])
            {
                case 0 : red_c += 1;
                    break;
                case 1 : white_c += 1;
                    break;
                case 2 : blue_c += 1;
                    break;
            }
        }
        int count = 0;
        while(count<red_c)
        {
            nums[count++] = 0;
        }
        while((count-red_c)<white_c)
        {
            nums[count++] = 1;
        }
        while((count-red_c-white_c)<blue_c)
        {
            nums[count++]= 2;
        }
    }
}
