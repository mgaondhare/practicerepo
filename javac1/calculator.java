package javac1;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {	
		float num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		num1 =sc.nextFloat();
		
		System.out.println("enter second number");
		num2=sc.nextFloat();
		
		System.out.println("you have entered "+num1+ " and " +num2);
		String note="Press 0 for add; 1 for substract; 2 for multiply";	
		System.out.println(note);
	
		int input = sc.nextInt();
		switch (input) {
		case 0:
			System.out.println("Your addition is");
			System.out.println(num1+num2);
			break;
		case 1:
			System.out.println("Your substraction is");
			System.out.println(num1-num2);
			break;
		case 2:	
			System.out.println("Your multiplication is");			
			System.out.println(num1*num2);
			break;
			
		default:
			System.out.println("invalid entry");
		}
	}
}
