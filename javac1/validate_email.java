package javac1;
import java.util.regex.Pattern;
public class validate_email {
	
	public static void main(String[] args) {
		String email1 = "maheshgaondhare.m@gmail.com";
		System.out.println(verifymail(email1));
	}
	 static String verifymail(String email) {
		if (email==null || email.isEmpty()) {
			return "invalid email";
		}
	//	String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		String regex="[a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}";
				//	  [a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3};
			//		  [a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3};
		
		String regex1="[a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}";
		Pattern p= Pattern.compile(regex);
		
	if (p.matcher(email).matches()) {
		return "valid mail";
	}
	else {
		return "invalid email";
	}
	}
}





	






