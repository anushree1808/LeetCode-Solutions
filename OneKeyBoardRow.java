package LeetCode;

import java.util.ArrayList;

/*
 * Given a List of words, return the words that can be typed using 
 * letters of alphabet on only one row's of American keyboard
 * 
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
	Output: ["Alaska", "Dad"]
 */

public class OneKeyBoardRow 
{
	public String[] findWords(String[] words) 
    {
        int [] hash = new int[26];
        hash['q'-'a'] = 1; 
        hash['w'-'a'] = 1; 
        hash['e'-'a'] = 1; 
        hash['r'-'a'] = 1; 
        hash['t'-'a'] = 1; 
        hash['y'-'a'] = 1; 
        hash['u'-'a'] = 1; 
        hash['i'-'a'] = 1; 
        hash['o'-'a'] = 1; 
        hash['p'-'a'] = 1; 
        hash['a'-'a'] = 2; 
        hash['s'-'a'] = 2;
        hash['d'-'a'] = 2;
        hash['f'-'a'] = 2;
        hash['g'-'a'] = 2;
        hash['h'-'a'] = 2;
        hash['j'-'a'] = 2;
        hash['k'-'a'] = 2;
        hash['l'-'a'] = 2;
        hash['z'-'a'] = 3;
        hash['x'-'a'] = 3;
        hash['c'-'a'] = 3;
        hash['v'-'a'] = 3;
        hash['b'-'a'] = 3;
        hash['n'-'a'] = 3;
        hash['m'-'a'] = 3;
        
        ArrayList<String> ret = new ArrayList<String>();
        
        for (String word : words)
        {
            char[] c = word.toLowerCase().toCharArray();
            int cur_hash = hash[c[0]-'a'];
            boolean flag = true;
            for (int i=1; flag && i< c.length  ; i++)
            {
                if(cur_hash != hash[c[i]-'a'])
                    flag = false;
            }
            if(flag)
            {
                ret.add(word);
            }
        }
        return ret.toArray(new String[ret.size()]);
    }
}
