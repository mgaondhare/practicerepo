package OOPs;
public class method_overloading {
	int a;
	int b;
	int c;				// method Overloading
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		method_overloading s = new method_overloading ();
		s.add(20, 30);
		s.add(20, 30, 50);
	}
}