/*
create an boolean arrays row and col and when a row contains a element zero set row element = 0 and similary col
after this the or operation between two boolean arrays provide the entire row and coloumn to zero.
*/
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean rows[] =  new boolean[n];
        boolean col[] = new boolean[m];
        for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
            if(matrix[i][j]==0){
                rows[i] =  true;
                col[j] = true;
            }
         }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rows[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
