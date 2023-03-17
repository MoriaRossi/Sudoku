package org.example.tableau;

import java.util.ArrayList;
import java.util.List;

public class ModificationTabForDeleteElement {
    public String[] newTab(String[] tab, String deleteNumber){

        List<String> myTab = new ArrayList<>();

        for(int i = 0; i < tab.length; i++){
            myTab.add(tab[i]);
        }

        myTab.remove(deleteNumber);
        return myTab.toArray(new String[myTab.size()]);
    }
}
