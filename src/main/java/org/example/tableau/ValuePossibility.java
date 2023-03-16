package org.example.tableau;

import java.util.Arrays;

public class ValuePossibility {
    private String[][][] tabPossibilitySquare;

    public String[][][] value(String tab[][], String[][][] tabPossibilitySquare, int row, int column){
        this.tabPossibilitySquare = tabPossibilitySquare;

        Rule rule = new Rule();
        ModificationOfPossibilityTab modificationOfPossibilityTab = new ModificationOfPossibilityTab();


        for(int i = 0; i < tab.length; i++){
            String[] possibility = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};

            if( (tab[column][i].contains("0"))){
                for(int y = possibility.length; y > 0; y--) {
                    if((rule.analyseRow(column,possibility[y-1], tab) == true) || (rule.analyseColumn(row,possibility[y-1], tab) == true) || (rule.analyseUnderGrid(row, column, possibility[y-1], tab) == true)){

                        possibility = modificationOfPossibilityTab.newTabPossibility(possibility,possibility[y-1]);
                    }
                }
                this.tabPossibilitySquare[column][i] = possibility;
            }
        }
        return tabPossibilitySquare;
    }


}
