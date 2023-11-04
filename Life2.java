package gameoflife;

public class Life2 {
	
    public static int numRows(boolean [][] cells){
        return cells.length;
    }

    public static int numCol(boolean [][] cells){
        return cells[0].length;
    }

    public static boolean isValid(boolean [][] cells, int row, int col){
        if (row < 0 || row >= numRows(cells)){
            return false;
        }
        else return col >= 0 && col < numCol(cells);
    }

    public static boolean [][] clone(boolean [][] cells){
        int rows = numRows(cells);
        int col = numCol(cells);

        boolean [][] copy = new boolean[rows][col];

        for (int r = 0; r < rows; r++){
            for (int c = 0; c < col; c++){
                copy[r][c] = cells[r][c];
            }
        }

        return copy;

    }

    public static void printCells(boolean [][] cells){
        for (boolean[] cell : cells) {
            for (int c = 0; c < cells[0].length; c++) {
                if (cell[c]) {
                    System.out.print('#');
                } else {
                    System.out.print('-');
                }

            }
            System.out.println();
        }

    }

    public static boolean [][] neighborhood(boolean [][] cells, int row, int col){
        if (!isValid(cells, row, col)){
            throw new IllegalArgumentException("You must input a valid cell, row and col.");
        }

        boolean [][] nHood = {{false, false, false},
                             {false, false, false},
                             {false, false, false}};

        int left = col - 1;
        int top = row - 1;

        for (int r = 0; r < 3; r++){
            int cellsRow = top + r;

            for (int c = 0; c < 3; c++){
                int cellsCol = left + c;

                if (isValid(cells, cellsRow, cellsCol)){
                    nHood[r][c] = cells[cellsRow][cellsCol];
                }
            }
        }
        return nHood;
    }

    public static boolean isAlive(boolean [][] cells, int row, int col){
        if (!isValid(cells, row, col)){
            throw new IllegalArgumentException();
        }

        return cells[row][col];

    }

    public static int numAlive(boolean [][] cells){
        int nAlive = 0;
        for (boolean[] cell : cells) {
            for (int c = 0; c < cells[0].length; c++) {
                if (cell[c]) {
                    nAlive++;
                }
            }
        }

        return nAlive;
	
    }

}
