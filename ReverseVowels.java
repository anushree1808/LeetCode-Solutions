package LeetCode;

public class ReverseVowels 
{
	public static void main(String args[])
	{
		String s = "hello";
		ReverseVowels obj = new ReverseVowels();
		System.out.println(obj.reverseVowels(s));
	}
	
	public String reverseVowels(String s) 
    {
        if(s==null)
        {
            return null;
        }
        int left = 0;
        int right = s.length()-1;
        char [] c = s.toCharArray();
        while(left<right)
        {
            if(c[left]!='a' && c[left]!='e' && c[left]!='i' && c[left]!='o' && c[left]!='u')
            {    
            	System.out.println(c[left]+" "+left);
            	left++;
            }
            else if(c[right]!='a' && c[right]!='e' && c[right]!='i' && c[right]!='o' && c[right]!='u')
            {
            	System.out.println(c[right]+" "+right);
            	right--;
            }
            else
            {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                System.out.println(new String (c));
                left++;
                right--;
            }
        }
        return new String(c);
    }
}
