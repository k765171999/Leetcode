class Solution {
    public void rotate(int[][] matrix) {
        reverse(matrix);
        for(int i = 0;i<matrix.length;i++){
            int e = matrix.length-1;
            int h = 0;
            while(e>h){
                int tmp = matrix[i][h];
                matrix[i][h] = matrix[i][e];
                matrix[i][e] = tmp;
                e--;
                h++;
            }
        }
    }
    public static void reverse(int temp [][]) {
        for (int i = 0; i < temp.length; i++) {
            for (int j = i; j < temp[i].length; j++) {
                int k = temp[i][j] ;
                temp[i][j] = temp[j][i] ;
                temp[j][i] = k ;
            }
        }
    }
}