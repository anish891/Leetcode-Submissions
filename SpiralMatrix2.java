public class SpiralMatrix2 {
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            
            int num = 1;
            
            int i = 0;
            int j = 0;
            int loop = n % 2 == 0 ? n/2-1 : n / 2;
    
            for (int k = 0; k <= loop; k++) {
                i = k;
                j = k;
                matrix[i][j] = num;
                num++;
                // move left
                while(++j < n) {
                    if (matrix[i][j] != 0) break;
                    matrix[i][j] = num++;
                }
                // move down
                j--;
                while(++i < n) {
                    if (matrix[i][j] != 0) break;
                    matrix[i][j] = num++;
                }
                // move right
                i--;
                while(--j >= 0) {
                    if (matrix[i][j] != 0) break;
                    matrix[i][j] = num++;
                }
                // move up
                j++;
                while(--i >= 0) {
                    if (matrix[i][j] != 0) break;
                    matrix[i][j] = num++;
                }
            }
            
            return matrix;
        }
    }
