public class SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
            int startRow = 0;
            int startCol = 0;
            int endRow = matrix.length-1;
            int endCol = matrix[0].length -1;
            List<Integer> ans = new ArrayList<>();
            while(startRow <= endRow && startCol <= endCol){
                // top boundary
                for(int j=startCol;j<=endCol;j++){
                    ans.add(matrix[startRow][j]);
                }
                // right boundary 
                for(int i=startRow+1;i<=endRow;i++){
                    ans.add(matrix[i][endCol]);
                }
                // bottom boundary
                for(int j=endCol-1;j>=startCol;j--){
                    if(startRow == endRow){
                        break;
                    }
                    ans.add(matrix[endRow][j]);
                }
                // left boundary
                for(int i=endRow-1;i>=startRow+1;i--){
                    if(startCol == endCol){
                        break;
                    }
                    ans.add(matrix[i][startCol]);
                }
                startCol++;
                startRow++;
                endRow--;
                endCol--;
            }
            return ans;
        }
    }

