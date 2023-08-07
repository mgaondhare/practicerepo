package Exception_Handling;

public class ArithmaticException {
	public static void main(String[] args) {
		try {
		int x=100/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		System.out.println("hello mahesh");
	}
}
