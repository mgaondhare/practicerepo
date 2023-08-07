package OOPs;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		
		System.out.println("Enter name, age and salary:");
		
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		double salary =sc.nextDouble();
		
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);
		
	}

}
