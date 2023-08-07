package Java2;

import java.util.regex.Pattern;

public class test7 {
	static String validmail(String email){
		if (email==null  ||  email.isEmpty()) {
			return "invalid email";		
	}
		//		  [a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}
	String regex="[a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}";
	Pattern p=Pattern.compile(regex);
	
	if(p.matcher(email).matches()) {
		return "valid mail";
	}
	else {
	
	return "invalid mail";
	}
	}	
	public static void main(String[] args) {
		
	String email="maheshgaondhare.m@gmail.com";	
		
	System.out.println(validmail(email));		
		
	}

}
