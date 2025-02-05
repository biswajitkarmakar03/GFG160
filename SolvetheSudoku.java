class Solution {
    static boolean isSafe(int[][] grid, int row, int col, int val){
        for(int i = 0; i < 9; i++){
            if(grid[row][i] == val || grid[i][col] == val)
                return false;
        }        
                
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(grid[srow + i][scol + j] == val)
                    return false;
            }
        }
        
        return true;
    }

    static boolean solveSudoku(int[][] grid) {
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(grid[row][col] == 0){
                    for(int val = 1; val <= 9; val++){
                        if(isSafe(grid, row, col, val)){
                            grid[row][col] = val;
                            if(solveSudoku(grid))
                                return true;
                            grid[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    static void printGrid(int[][] grid){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        int[][] grid = {
          {3, 0, 6, 5, 0, 8, 4, 0, 0},
          {5, 2, 0, 0, 0, 0, 0, 0, 0},
          {0, 8, 7, 0, 0, 0, 0, 3, 1},
          {0, 0, 3, 0, 1, 0, 0, 8, 0},
          {9, 0, 0, 8, 6, 3, 0, 0, 5},
          {0, 5, 0, 0, 9, 0, 6, 0, 0},
          {1, 3, 0, 0, 0, 0, 2, 5, 0},
          {0, 0, 0, 0, 0, 0, 0, 7, 4},
          {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        
        if(solveSudoku(grid)){
            printGrid(grid);
        }else{
            System.out.println("No Solution exists.");
        }
    }
}
