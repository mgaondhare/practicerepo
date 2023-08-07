package Interface;

interface class1{
	void m1(String name);

	void m2(int a);
	}

public class democlass implements class1 {

	public static void main(String[] args) {
		
		democlass s= new democlass();
		s.m1("mahesh");
		s.m2(28);
	}

	@Override
	public void m1(String name) {
		System.out.println("name is: "+name);
	}

	@Override
	public void m2(int a) {
		System.out.println("age is: "+a);
		
	}

}
