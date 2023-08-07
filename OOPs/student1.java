package OOPs;
public class student1 {
	String name;
	int rno;
	 void printdata() {
		System.out.println(name + rno);
	}
	public static void main(String[]args) {
		student1 s1 = new student1();
		s1.name="mahesh";
		s1.rno=2;
		
		student1 s2 = new student1();
		s2.name="rahul";
		s2.rno=1;
		s1.printdata();   // to store the data  by reference variable
		s2.printdata();
	}
}
