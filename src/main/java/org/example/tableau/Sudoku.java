package org.example.tableau;

public class Sudoku {
    public String[][] Square(String[][] tableau, String[][][] tabPossibilitySquare) {

        ValuePossibility valuePossibility = new ValuePossibility();

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                    valuePossibility.value(tableau, tabPossibilitySquare, i, j);
                }
            }
        return tableau;
    }
}
