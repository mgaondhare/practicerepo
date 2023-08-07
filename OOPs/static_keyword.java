package OOPs;

public class static_keyword {

	String name;   //  Static keyword used for variables
	static String Schoolname;
	int rno;
	
	public static void main(String[] args) {
		
		static_keyword s= new static_keyword();
		s.name="mahesh";
		Schoolname="skncollege";
		s.rno=1;
		System.out.println(s.name+" "+s.rno+ " "+ s.Schoolname);
		
		static_keyword s1 = new static_keyword();
		s1.name="suresh";
		s1.rno=2;
		System.out.println(s1.name+" "+s1.rno+ " "+ s1.Schoolname);
	}

}
