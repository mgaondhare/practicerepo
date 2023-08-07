package OOPs;

public class Constructor {

	String name;  //  Parameterized constructor
	int rno;
	Constructor(String Sname,int srno) {
	
		name=Sname;
		rno=srno;		
	}
	public static void main(String[] args) {
		
		Constructor r = new Constructor("mahesh",200);
		System.out.println(r.name+" "+r.rno);
	}
}
