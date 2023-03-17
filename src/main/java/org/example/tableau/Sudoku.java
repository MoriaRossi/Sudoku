package org.example.tableau;

public class Sudoku {
    public String[][] Square(String[][] tableau, String[][][] tabPossibilitySquare) {

        ValuePossibility valuePossibility = new ValuePossibility();
        CheckSoloValue checkSoloValue = new CheckSoloValue();
        ChangeTabPossibilitySquare changeTabPossibilitySquare = new ChangeTabPossibilitySquare();

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                    valuePossibility.value(tableau, tabPossibilitySquare, i, j);
                }
            }

        String[][] newTab = checkSoloValue.checkSoloValue(tabPossibilitySquare,tableau);
        String[][][] newTabChangePossibilitySquare= changeTabPossibilitySquare.changeTabPossibility(tabPossibilitySquare);

        for(int i = 0; i < tableau.length; i++){
            for (int y = 0; y < tableau[i].length; y++){
                if((tableau[i][y].contains("0"))){
                    Square(newTab, newTabChangePossibilitySquare);
                }
            }
        }

        return newTab;
    }
}
