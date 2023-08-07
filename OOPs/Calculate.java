package OOPs;
public class Calculate {
    int a;
    int b;

    static int v1(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = Calculate.v1(4, 5); // by using method
        System.out.println("The sum is: " + result);
    }
}
