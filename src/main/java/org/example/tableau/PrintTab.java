package org.example.tableau;

public class PrintTab {
    public void printTab(String[][] tableau){
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
