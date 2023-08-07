package javac1;

public class WordSize {
    public static void main(String[] args) {
        String[] a = { "ab", "abc", "abcdefghijklmn", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi",
                "abcdefghij", "abcdefghijk", "abcdefghijklm", "abcdefghijkl", "a" };

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].length() > a[j].length()) {
                    String temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        System.out.println(a[4]);
    }
}
