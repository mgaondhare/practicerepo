package Exception_Handling;

public class Nullpointerexception {

	public static void main(String[] args) {
		try {
		String s= null;
		System.out.println(s.length());
		}
		catch (NullPointerException e)
		{
		System.out.println(e.toString());
		}
		
		System.out.println("hello shubham");
	}

}
