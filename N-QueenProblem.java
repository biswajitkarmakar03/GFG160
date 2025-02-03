class Solution {
    static boolean isSafe(int row, int col, boolean[][] board){
        for(int i = col; i >= 0; i--)
            if(board[row][i])
                return false;
                
        for(int i = row, j = col; j >= 0 && i >= 0; i--, j--)
            if(board[i][j])
                return false;
            
        for(int i = row, j = col; j >= 0 && i < board.length; i++,j--)
            if(board[i][j])
                return false;
            
        return true;
    }
    static void solve(boolean[][] board, ArrayList<ArrayList<Integer>>res,int col, int n){
        if(col == n){
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    if(board[j][i])
                        ans.add(j + 1);
            res.add(ans);
            return;
        }
        
        for(int i = 0; i < n; i++){
            if(isSafe(i,col,board)){
                board[i][col] = true;
                solve(board,res,col+1,n);
            }
            board[i][col] = false;
        }
    }
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        solve(board,res,0,n);
        return res;
    }
}
