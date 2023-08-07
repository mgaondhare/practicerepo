package OOPs;

public class p3 {
	 int insertdata(int a, int b) {
	//	System.out.println("value of a and b is "+(a+b));
	return (a+b);
	 }
	public static void main(String[] args) {
		p3 v= new p3();
	//	v.insertdata(6, 3);
	
	int result=v.insertdata(10, 20);
	
	System.out.println("value of a and b is "+result);
	}
}
