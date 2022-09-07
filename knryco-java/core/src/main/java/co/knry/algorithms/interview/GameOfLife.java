package co.knry.algorithms.interview;

public class GameOfLife {

    public static int[][] simulate(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            int[] col = grid[i];
            for (int j = 0; j < col.length; j++) {
                int liveNeighbors = getLiveNeighbors(grid, i, j);

                int cell = grid[i][j];

                if (cell==1 && (liveNeighbors < 2 || liveNeighbors > 3)){
                    grid[i][j] = 3;
                }
                if (cell==0 && liveNeighbors==3){
                    grid[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            int[] col = grid[i];
            for (int j = 0; j < col.length; j++) {
                int cell = grid[i][j];
                if (cell == 2){
                    grid[i][j] = 1;
                }
                else if (cell == 3){
                    grid[i][j] = 0;
                }
            }
            System.out.println("");
        }


        return grid;

    }

    private static int getLiveNeighbors(int[][] grid, int row, int col) {
        int liveNeighbors = 0;

        for (int [] direction: directions){
            int rowOffset = row +  direction[0];
            int colOffset = col +  direction[1];

            if (!isInBounds(grid, rowOffset, colOffset)) {
                continue;
            }

            int neighbour = grid[rowOffset][colOffset];

            if (neighbour==1 || neighbour==3) {
                liveNeighbors++;
            }
        }

        return liveNeighbors;
    }

    private static boolean isInBounds(int[][] grid, int row, int col) {
        return row >=0 && col>=0 && row < grid.length && col < grid[0].length;
    }

    static int[][] directions = new int[][]{
            {0, 1}, {1, 0}, {1, 1},  {-1, -1}, {0, -1}, {-1, 0}, {-1, 1}, {1, -1}
    };

}
