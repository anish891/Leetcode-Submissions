public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(Integer it:rows){
            for(int i=0;i<matrix[0].length;i++){
                matrix[it][i] = 0;
            }
        }
        for(Integer it:cols){
            for(int i=0;i<matrix.length;i++){
                matrix[i][it] = 0;
            }
        }
    }
}
