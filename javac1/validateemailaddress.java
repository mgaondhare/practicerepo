package javac1;

import java.util.regex.Pattern;

public class validateemailaddress {

	public static String validateemail(String email) {
		
		if (email==null || email.isEmpty()) {
			
			return "invalid entry";
		}
		String regex = "[a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}";
		
		Pattern p = Pattern.compile(regex);
		
		if (p.matcher(email).matches()) {
			return "valid email address";
		}
		else {
			return "invalid email";
		}	
	}

	public static void main(String[] args) {
		String email = "maheshgaondhare.m@gmail.com";
		//validateemail(email);
		System.out.println(validateemail(email));
		
	}

}
