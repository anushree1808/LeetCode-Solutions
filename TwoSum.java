package LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TwoSum 
{
	public static void main(String args[]) throws Exception
	{
		/*BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		String arr[] = reader.readLine().split(" ");
		int x  = Integer.parseInt(reader.readLine());*/
		int arr []= {2, 4, 5, 2, 1, 6};
		int x = 6;
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for (int i=0; i<arr.length; i++)
		{
			if(map.containsKey(x-arr[i]))
			{
				System.out.println(map.get(x-arr[i])+" "+i);
				System.out.println(x-arr[i]+" "+arr[i]);
				return;
			}
			else
			{
				map.put(arr[i], i);
			}
		}
		
		int ret[] = TwoSum.retTwoSum(arr, x);
		System.out.println(ret[0]+" "+ret[1]);
	}
	
	public static int[] retTwoSum(int arr[],int x)
	{
		int[] ret = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for (int i=0; i<arr.length;i++)
		{
			if(map.containsKey(x-arr[i]))
			{
				ret[0] = x-arr[i];
				ret[1] = arr[i];
				break;
			}
			else
			{
				map.put(arr[i], i);
			}
		}
		return ret;
	}
}
