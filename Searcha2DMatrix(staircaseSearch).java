public class Searcha2DMatrix(staircaseSearch) {
    int row =0, col = matrix[0].length-1;

        while(row < matrix.length && col >=0){
            if(matrix[row][col] == key){
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
}
