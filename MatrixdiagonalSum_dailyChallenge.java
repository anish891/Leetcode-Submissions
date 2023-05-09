public class MatrixdiagonalSum_dailyChallenge {
    public int diagonalSum(int[][] matrix) {
        int sum =0;
        for(int i=0;i<matrix.length;i++){   // O(n) time complexity
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if (i != matrix.length-i-1)   // for removing the repeated element in first loop for odd numbers
                sum += matrix[i][matrix.length-i-1];
        }
        return sum;
    }
}
