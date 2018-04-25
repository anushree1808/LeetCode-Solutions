package LeetCode;

import java.util.Stack;

public class ReversePolishNotation 
{
	public int evalRPN(String[] tokens) 
    {
        Stack<String> stack = new Stack<String>();
        //char[] chars = new char[tokens.length];
        int i=0;
        /*for (String t : tokens)
        {
            chars[i++] = t.charAt(0);
        }*/
        for (String c : tokens)
        {
            
                if(c.equals("+")) 
                {
                    int i1 = Integer.valueOf(stack.pop());
                    int i2 = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(i1+i2));
                }
                else if(c.equals("-")) 
                {
                    int i1 = Integer.valueOf(stack.pop());
                    int i2 = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(i2-i1));
                }
                else if(c.equals("*")) 
                {
                    int i1 = Integer.valueOf(stack.pop());
                    int i2 = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(i1*i2));
                }
                else if(c.equals("/")) 
                {
                    int i1 = Integer.valueOf(stack.pop());
                    int i2 = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(i2/i1));
                }
                else
                    stack.push(c);
        }
        return Integer.valueOf(stack.pop());
    }
}
