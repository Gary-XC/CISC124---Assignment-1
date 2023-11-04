package gameoflife;

import java.util.Arrays;


public class DemoLife2 {
    public static void main(String[] args) {

        boolean [][] cells = new boolean[3][5];
        for (int r = 0; r < cells.length; r++){
            for (int c = 0; c < cells[0].length; c++){
                cells[r][c] = false;
            }
        }
        cells[2][3] = true;

        int rows = Life2.numRows(cells);
        int col = Life2.numCol(cells);

        System.out.println("number of rows = " + rows);
        System.out.println("number of cols = " + col);
        System.out.println();

        System.out.println("is valid = " + Life2.isValid(cells, 0, 0));
        System.out.println("is valid = " + Life2.isValid(cells, rows, 0));
        System.out.println("is valid = " + Life2.isValid(cells, 0, col));
        System.out.println();

        boolean [][] copy = Life2.clone(cells);
        System.out.println("Copy = " + Arrays.deepToString(copy));

        Life2.printCells(copy);
        System.out.println();

        boolean [][] neigh = Life2.neighborhood(cells, 1, 3);
        Life2.printCells(neigh);
        System.out.println();

        boolean [][] neighTwo = Life2.neighborhood(cells, 2, 4);
        Life2.printCells(neighTwo);
        System.out.println();

        System.out.println("is alive = " + Life2.isAlive(cells, 0, 0));
        System.out.println("is alive = " + Life2.isAlive(cells, 2, 3));
        System.out.println();

        boolean [][] cellsTwo = {{true, true}, {true, false}};

        Life2.printCells(cellsTwo);
        System.out.println("num alive = " + Life2.numAlive(cellsTwo));
    
	}

}
