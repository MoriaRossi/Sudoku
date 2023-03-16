package org.example;

import org.example.tableau.PrintTab;
import org.example.tableau.Sudoku;

public class Main {
    public static void main(String[] args) {
        Sudoku square = new Sudoku();
        PrintTab printTab = new PrintTab();

        String[][] tableau = {
                {"6", "0", "0", "8", "2", "7", "5", "0", "9"},
                {"2", "5", "0", "0", "4", "0", "0", "3", "0"},
                {"0", "8", "0", "0", "0", "1", "0", "7", "2"},
                {"0", "0", "2", "4", "0", "0", "0", "0", "7"},
                {"0", "0", "6", "7", "5", "0", "0", "8", "0"},
                {"7", "4", "5", "2", "1", "0", "0", "0", "0"},
                {"5", "6", "1", "0", "7", "0", "9", "2", "8"},
                {"4", "0", "0", "0", "0", "0", "0", "0", "3"},
                {"0", "0", "0", "9", "0", "2", "0", "1", "0"}

        };

        String[][][] tabPossibilitySquare ={
                {{},{},{},{},{},{},{},{},{}},
                {{},{},{},{},{},{},{},{},{}},
                {{},{},{},{},{},{},{},{},{}},
                {{},{},{},{},{},{},{},{},{}},
                {{},{},{},{},{},{},{},{},{}},
                {{},{},{},{},{},{},{},{},{}},
                {{},{},{},{},{},{},{},{},{}},
                {{},{},{},{},{},{},{},{},{}},
                {{},{},{},{},{},{},{},{},{}}
        };

        String[][] finishTab = square.Square(tableau, tabPossibilitySquare);
        printTab.printTab(finishTab);

    }
}