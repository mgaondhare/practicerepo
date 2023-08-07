package Java2;

public class test3 {
	// Reverse char
	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "";

		for (int i = 0; i < a.length(); i++) {
		  b = a.charAt(i) + b;
		

		System.out.println("Reversed string: "+ b);
		}
	}
	
	
}
