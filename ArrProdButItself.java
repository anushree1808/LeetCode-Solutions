package LeetCode;

/*Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal 
 * to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * For example, given [1,2,3,4], return [24,12,8,6].
 */

public class ArrProdButItself 
{
	public int[] productExceptSelf(int[] nums) 
    {
        int res_arr[] = new int[nums.length];
        int lprod = 1;
        for (int i=0; i<nums.length; i++)
        {
            res_arr[i] = lprod;
            lprod *= nums[i];
        }
        int rprod = 1;
        for(int i=nums.length-1; i>=0 ; i--)
        {
            res_arr[i] *= rprod;
            rprod *= nums[i];
        }
        return res_arr;
    }
}
