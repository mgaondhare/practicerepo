package Javac;
import java.util.regex.Pattern;
public class validateemailaddress {
	public static String verifyemail(String email) {
		String regex = "[a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}";
		Pattern p = Pattern.compile(regex);
		if (email==null  || email.isEmpty()) {
			return "invalid email";
		}
		if(p.matcher(email).matches()){
			return "valid mail ID";
		}
		else {
			return "invalid email ID";
	}
	}
	public static void main(String[] args) {
		String email= "shubhamwarade4@gmail.com";
		System.out.println(verifyemail(email));
	}
}
