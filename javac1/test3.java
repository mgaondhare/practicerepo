package javac1;

import java.util.ArrayList;
import java.util.List;

public class test3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < 8; i++) { // Changed the loop condition to i < 7
            int current = list.get(i);
            int next = list.get(i + 1);
            int sum = current + next;

            // Check if the elements are present in the input list
            if (list.contains(sum)) {
                List<Integer> a = new ArrayList<>();
                a.add(current);
                a.add(next);
                a.add(sum);
                result.add(a);
                System.out.println(result.get(result.size() - 1)); // Print the last added list
            }
        }
    }
}
