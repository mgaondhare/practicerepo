package OOPs;

import java.util.Scanner;

public class calculate1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        
        int result = v1(a, b); // by using method
        
        System.out.println("The sum is: " + result);
        
        scanner.close();
    }

    static int v1(int a, int b) {
        return a + b;
    }
}
