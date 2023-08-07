package OOPs;

public class static_keyword1 {

	String name;   //  Static keyword used for methods
	static String Schoolname = "SKN";
	int rno;
	
	static_keyword1(String Sname,int Srno){
		name=Sname;
		rno=Srno;
	}
	void Display() {
		System.out.println(name+ " "+rno+" "+Schoolname);
		
	}
	static void changecollegename() {
		Schoolname ="KPC";
	}
	
	public static void main(String[] args) {
		
		static_keyword1 s= new static_keyword1("mahesh",2);
		static_keyword1 s1= new static_keyword1("suresh",4);
		
		s.Display();
		s1.Display();
		
		s.changecollegename();  // we can change Static variable values by
								//	using static method
		
		
		s.Display();
		s1.Display();
		
	}

}
