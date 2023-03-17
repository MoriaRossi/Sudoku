package org.example.tableau;

public class CheckSoloValue {
    public String[][] checkSoloValue(String[][][] tabPossibilitySquare, String[][] tableau){
        for(int i = 0; i < tableau.length; i++){
            for (int y = 0; y < tableau[i].length; y++){
                if((tableau[i][y].contains("0")) && (tabPossibilitySquare[i][y].length == 1)){
                    tableau[i][y] = tabPossibilitySquare[i][y][0];
                }
            }
        }
        return tableau;
    }
}
