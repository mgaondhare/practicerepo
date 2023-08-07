package Java2;

import java.util.Scanner;

public class tets1 {
	
	//  Even and odd number
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enrter value: ");
		int a= sc.nextInt();
		
		if (a%2==0) {
			System.out.println("its an even number");
		}
		else
			System.out.println("its an odd number");
	}	
}
