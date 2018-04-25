package LeetCode;

// "https://leetcode.com/problems/word-search/description/"
public class WordSearch2DArray {
	int[] rows = {-1, 0, 1, 0};
    int[] cols = {0, -1, 0, 1};
    
    public boolean exist(char[][] board, String word) 
    {
        if (board==null || board.length==0)
            return false;
        boolean visited[][] = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[i].length; j++)
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, visited, word, 0))
                    return true;
        return false;
    }
    
    public boolean dfs(char[][]board, int i, int j, boolean[][] visited, String word, int index)
    {
        if (index == word.length())
            return true;
        if (i<0 || j<0 || i>=board.length || j>=board[0].length)
            return false;
    	if (visited[i][j])
    		return false;
        if(board[i][j] != word.charAt(index))
            return false;
        visited[i][j] = true;
        boolean exists = false;
        for (int k=0; k<4; k++)
        {
            exists = exists || dfs(board, i+rows[k], j+cols[k], visited, word, index+1);
        }
        visited[i][j] = false;
        return exists;
    }
    
    public static void main(String args[])
    {
    	WordSearch2DArray obj = new WordSearch2DArray();
    	String word = "aaa";
    	char[] a = new char[] {'a', 'a'};
    	char[][] myArr = new char[][] {a};
    	System.out.println(obj.exist(myArr, word));
    }
}
