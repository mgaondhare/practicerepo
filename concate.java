package Javac;

public class concate {

	public static void main(String[] args) {
		
		 String item1 = "Hello";
	        String item2 = "world";
	        int number = 42;
	        String item3="mahi";
	        StringBuffer stringBuffer = new StringBuffer();
	        stringBuffer.append(item1)
	                    .append(" ## ")
	                    .append(item2)
	                    .append(" ")
	                    .append(number);
	        stringBuffer.append(item3);
	        String result = stringBuffer.toString();
	        System.out.println(result);
	    }
	}
		
