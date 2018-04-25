package LeetCode;

public class GameOfLife 
{
	    public void gameOfLife(int[][] board) 
	    {
	        int m = board.length;
	        int n = board[0].length;
	        int ret_board [][] = new int [m][n];
	        for (int i=0; i<m; i++)
	            for (int j=0; j<n; j++)
	                if(aliveStatus(board,i,j,m,n))
	                    ret_board[i][j] = 1;
	                else
	                    ret_board[i][j] = 0;
	        for (int i=0; i<m; i++)
	            for (int j=0; j<n; j++)
	                board[i][j] = ret_board[i][j];
	    }
	    
	    public boolean aliveStatus(int [][] board, int row, int col, int m, int n)
	    {
	        int [] rows = {-1,-1,-1,0,0,1,1,1};
	        int [] cols = {-1,0,1,-1,1,-1,0,1};
	        int alives =0;
	        if (board[row][col]==1)
	        {
	            for (int k=0; k<8; k++)
	            {
	                if(row+rows[k]<m && row+rows[k]>=0 && col+cols[k]<n && col+cols[k]>=0 && board[row+rows[k]][col+cols[k]]==1)
	                    alives += 1;
	            }
	            if (alives <2)
	                return false;
	            else if (alives==2 || alives==3)
	                return true;
	            else
	                return false;
	        }
	        else
	        {
	            for (int k=0; k<8; k++)
	            {
	                if(row+rows[k]<m && row+rows[k]>=0 && col+cols[k]<n && col+cols[k]>=0 && board[row+rows[k]][col+cols[k]]==1)
	                    alives += 1;
	            }
	            if (alives==3)
	                return true;
	            else
	                return false;
	        }
	    }
}
