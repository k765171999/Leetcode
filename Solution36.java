class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<9;i++){
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> column = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for(int j = 0;j < 9;j++){
            int rowindex = 3*(i/3);
            int colindex = 3*(i%3);
                //遍历行
                if(board[i][j] !='.'&&!row.add(board[i][j]))
                    return false;
                //遍历列
                if(board[j][i] !='.'&&!column.add(board[j][i]))
                    return false;
                //遍历3*3的方格
                if(board[rowindex+j/3][colindex+j%3]!='.'&&!cube.add(board[rowindex+j/3][colindex+j%3]))
                    return false;
            }
        }
        return true;
    }
