package org.example.tableau;

public class ChangeTabPossibilitySquare {
    public String[][][] changeTabPossibility(String[][][] tabPossibilitySquare){
        ModificationTabForDeleteElement modificationTabForDeleteElement = new ModificationTabForDeleteElement();
        String valueDelete;

        for(int i = 0; i< tabPossibilitySquare.length; i++){
            for(int y = 0; y< tabPossibilitySquare.length;y++){
                if(tabPossibilitySquare[y][i].length == 1){
                    valueDelete = tabPossibilitySquare[y][i][0];
                    tabPossibilitySquare[y][i] = modificationTabForDeleteElement.newTab(tabPossibilitySquare[y][i], valueDelete);
                }
            }
        }
        return tabPossibilitySquare;
    }
}