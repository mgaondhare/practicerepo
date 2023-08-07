package OOPs;
public class student {
	String name;
	int rno;
	void insertdata(String sname,int srno) {	
		name=sname;
		rno=srno;
	}
	void printdata() {
		System.out.println(name+" "+ rno);
	}
	public static void main(String[] args) {
		student p1 = new student();
		student p2 = new student();

		p1.insertdata("mahesh", 1);
		p2.insertdata("suresh", 2);
		p1.printdata();  // strore data by using methods
		p2.printdata();
	}
}
