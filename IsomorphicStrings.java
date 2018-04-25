package LeetCode;

public class IsomorphicStrings 
{
	public static boolean isIsomorphic(String s, String t) 
    {
        int [] c = new int[256];
        for (int i=0; i<256; i++)
        {
            c[i] = -1;
        }
        char [] s1 = s.toLowerCase().toCharArray();
        char [] s2 = s.toLowerCase().toCharArray();
        
        if (s1.length != s2.length)
            return false;
        
        for (int i=0; i<s1.length; i++)
        {
            System.out.println(s1[i]-'a');
            if (c[s1[i]-'a'] == -1)
            {
                c[s1[i]-'a'] = s2[i]-'a';
            }
            else if (c[s1[i]-'a'] == s2[i]-'a')
                continue;
            else 
                return false;
        }
        return true;
    }
	
	public static void main(String args[])
	{
		String a = "abccd";
		String b = "wxyyz";
		
		String print = IsomorphicStrings.isIsomorphic(a,b) ? "YES":"NO";
		System.out.println(print);
	}
}
