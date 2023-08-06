package Javac;


	import java.util.regex.Pattern;
	import java.util.regex.Matcher;
	import java.net.InetAddress;
	import java.net.UnknownHostException;

	public class EmailValidation {
	    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

	    public static void main1(String[] args) {
	        String email = "example@example.com";
	        if (isValidEmail(email)) {
	            System.out.println("Email address is valid");
	            if (isValidDomain(email)) {
	                System.out.println("Domain is valid");
	            } else {
	                System.out.println("Domain is invalid");
	            }
	        } else {
	            System.out.println("Email address is invalid");
	        }
	    }

	    public static boolean isValidEmail(String email) {
	        Pattern pattern = Pattern.compile(EMAIL_REGEX);
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	    }

	    public static boolean isValidDomain(String email) {
	        String[] parts = email.split("@");
	        String domain = parts[1];
	        try {
	            InetAddress address = InetAddress.getByName(domain);
	            return true;
	        } catch (UnknownHostException e) {
	            return false;
	        }
	    }


	
	
	
	public static void main(String[] args) {
		
	}

}
