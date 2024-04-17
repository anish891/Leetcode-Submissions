public class GameOfLife {
    public void gameOfLife(int[][] board) {
        // Define directions to visit neighboring cells
        int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        int x = board[0].length; // Number of columns in the board
        int y = board.length; // Number of rows in the board

        // Iterate through each cell in the board
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                int liveNeighbors = 0; // Initialize the count of live neighbors for the current cell
                
                // Count the live neighbors of the current cell
                for (int[] dir : directions) {
                    int h = j + dir[1]; // Horizontal position of the neighbor
                    int v = i + dir[0]; // Vertical position of the neighbor
                    // Check if the neighbor is within the bounds of the board and is alive (1) or dead (-1)
                    if (h >= 0 && h < x && v < y && v >= 0 && (board[v][h] == 1 || board[v][h] == -1)) {
                        liveNeighbors++; // Increment the count of live neighbors
                    }
                }
                
                // Determine the next state of the current cell based on its current state and the count of live neighbors
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = -1; // Next state: Dead
                }
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 2; // Next state: Alive
                }
            }
        }
        
        // Update the board based on the encoded next states
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 0; // Dead
                } else if (board[i][j] == 2) {
                    board[i][j] = 1; // Alive
                }
            }
        }
    }
}
