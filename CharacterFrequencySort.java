package LeetCode;

import java.util.*;
class CharacterFrequencySort {
    public String frequencySort(String s) 
    {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        for(char c : s.toCharArray())
        {
            if(hmap.containsKey(c))
                hmap.put(c, hmap.get(c)+1);
            else
                hmap.put(c, 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
        new Comparator<Map.Entry<Character, Integer>>(){
            @Override
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer>b){
                return b.getValue() - a.getValue();
            }
        }
        );
        
        pq.addAll(hmap.entrySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty())
        {
            Map.Entry<Character, Integer> p = pq.poll();
            for(int i=0; i<(int)p.getValue(); i++)
                sb.append(p.getKey());
        }
        return sb.toString();
    }
    
    public static void main(String args[])
    {
    	CharacterFrequencySort obj = new CharacterFrequencySort();
    	System.out.println(obj.frequencySort("treeste"));
    }
}
