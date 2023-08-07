package OOPs;
public class p1 {
	String name;
	int rno;
	public void insertdata(String sname,int srno) {
		name=sname;
		rno=srno;
	}
	public void printdata() {
		System.out.println(name+rno);
	}
}
