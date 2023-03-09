package org.example.tableau;


public class Rule {

    private boolean analyseRow(int row, int number, int tab[][]) {
        for (int i = 0; i < tab.length; i++)
            if (tab[row][i] == number)
                return true;

        return false;
    }

    private boolean analyseColumn(int column, int number, int tab[][]) {
        for (int i = 0; i < tab.length; i++)
            if (tab[i][column] == number)
                return true;

        return false;
    }

    private boolean analyseUnderGrid(int row, int column, int number, int tab[][]) {
        int ligne = row - row % 3;
        int colonne = column - column % 3;

        for (int i = ligne; i < ligne + 3; i++)
            for (int j = colonne; j < colonne + 3; j++)
                if (tab[i][j] == number)
                    return true;

        return false;
    }


}
