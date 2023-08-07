package OOPs;

import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("vlaue of a is: ");
		
		int a = sc.nextInt();
		
		System.out.println("value of b is: ");
		
		int b = sc.nextInt();
	
		int total=v1(a, b);
		System.out.println("addition is: "+total);
		sc.close();
	}
		static int v1(int a, int b) {	
			return a+ b;	
		}
	}
