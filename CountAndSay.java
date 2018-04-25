package LeetCode;

// https://leetcode.com/problems/count-and-say/description/
public class CountAndSay 
{
	public void countAndSay(int n) 
    {
        String s = "1";
        for (int i=1; i<n; i++)
        {
            s = countIdx(s);
        }
        System.out.println(s);
    }
    
    public String countIdx(String s)
    {
        char c = s.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<s.length(); i++)
        {
            if(s.charAt(i) == c)
                count += 1;
            else
            {
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
    
    public void countAndSay1(int n)
    {
    	String s = "1";
    	for(int i=1; i<n; i++)
    	{
    		s = countIdx1(s);
    	}
    	System.out.println(s);
    }
    
    public String countIdx1(String s)
    {
    	char [] chars = s.toCharArray();
    	int count = 1;
    	StringBuilder sb = new StringBuilder();
    	int n = chars.length;
    	for (int i=0; i<n; i++)
    	{
    		if(i==n-1 || chars[i]!=chars[i+1])
    		{
    			sb.append(count);
    			sb.append(chars[i]);
    			count = 1;
    		}
    		else
    		{
    			count += 1;
    		}
    	}
    	return sb.toString();
    }
    
    public static void main(String args[])
    {
    	CountAndSay obj = new CountAndSay();
    	obj.countAndSay(3);
    	obj.countAndSay1(5);
    }
}
