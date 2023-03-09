package org.example.tableau;

public class Sudoku {
    public int[][] Square() {
        int[][] tableau = {
                {6, 0, 0, 8, 2, 7, 5, 0, 9},
                {2, 5, 0, 0, 4, 0, 0, 3, 0},
                {0, 8, 0, 0, 0, 1, 0, 7, 2},
                {0, 0, 2, 4, 0, 0, 0, 0, 7},
                {0, 0, 6, 7, 5, 0, 0, 8, 0},
                {7, 4, 5, 2, 1, 0, 0, 0, 0},
                {5, 6, 1, 0, 7, 0, 9, 2, 8},
                {4, 0, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 9, 0, 2, 0, 1, 0}

        };
        //CreateSquareOne createSquareOne = new CreateSquareOne();
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                //tableau[i][j] = createSquareOne.Create(tableau);
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return tableau;
    }
}
