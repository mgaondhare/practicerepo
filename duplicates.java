package Javac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class duplicates {
    public static void main(String[] args) {
       
    	
        int[] a = {2, 4, 7, 2, 11, 5, 7, 14, 22, 11, 49, 58, 14, 101, 1, 3, 205, 49, 101, 12};

        
        ArrayList<Integer> duplicates = new ArrayList<>();

        
        HashSet<Integer> b = new HashSet<>();

       
        for (int i = 0; i < a.length; i++) {
            int all = a[i];

          
            if (b.contains(all)  && !  duplicates.contains(all)) {
                duplicates.add(all);
            } else {
                b.add(all);
            }
        }
        
        Collections.sort(duplicates, Collections.reverseOrder());

        for (int print : duplicates) {
            System.out.println(print);
        }
    }
}
