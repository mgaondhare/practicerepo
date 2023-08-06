package Javac;
import java.util.Scanner;
// Java Program to reverse a String
// without using inbuilt String function
import java.util.regex.Pattern;
public class reverse {
	 public static void main (String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        String Str = scanner.nextLine();
	        char[] arr = Str.toCharArray();
	                 
	        String rev = "";
	   
	 for(int i = Str.length() - 1; i >= 0; i--)
	 {
	 rev = rev + " " + Str.charAt(i);
	 }
	  
	 System.out.println(rev);
	         
	    }
	}
	 
