package org.example.tableau;


public class Rule {

    public boolean analyseRow(int column, String number, String tab[][]) {
        for (int i = 0; i < tab.length; i++)
            if (tab[column][i].contains(number))
                return true;

        return false;
    }

    public boolean analyseColumn(int row, String number, String tab[][]) {
        for (int i = 0; i < tab.length; i++)
            if (tab[i][row].contains(number))
                return true;

        return false;
    }

    public boolean analyseUnderGrid(int row, int column, String number, String tab[][]) {
        int ligne = row - row % 3;
        int colonne = column - column % 3;

        for (int i = ligne; i < ligne + 3; i++)
            for (int j = colonne; j < colonne + 3; j++)
                if (tab[j][i].contains(number))
                    return true;
        return false;
    }
}
