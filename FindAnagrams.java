package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams 
{
	public static void main(String args[])
	{
		FindAnagrams obj = new FindAnagrams();
		String s1 = "cbaebabacd";
		String s2 = "abc";
		
		ArrayList<Integer> anas = (ArrayList<Integer>) obj.findAnagrams(s1, s2);
		for(int i : anas)
		{
			System.out.print(i+" , ");
		}
		System.out.println("");
	}
	public List<Integer> findAnagrams(String s, String p) 
    {
        char[] s1 = s.toCharArray();
        char[] s2 = p.toCharArray();
        int n = s2.length;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<s1.length-n+1; i++)
        {
            if(isAnagram(s1,i,s2, n))
            {
                list.add(i);
            }
        }
        return list;
    }
    
    public boolean isAnagram(char[] s1, int pivot, char[] s2, int n)
    {
        int[] ch = new int[26];
        for(int i=0; i< n; i++)
        {
            ch[s2[i]-'a']+= 1;
        }
        for(int i=pivot; i<pivot+n; i++)
        {
            if(ch[s1[i]-'a']==0)
                return false;
            ch[s1[i]-'a'] -= 1;
        }
        for(int i=0; i<26; i++)
        {
            if(ch[i]!=0)
                return false;
        }
        return true;
    }
}
