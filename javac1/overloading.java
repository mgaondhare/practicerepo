package javac1;

public  class overloading {
	static String Studentname = "shubham";
	static int rollno;
	 void  method1(String name) {
		Studentname=name;
		name="shubham";
		System.out.println("name of candidate is : "+ name);
	
}
	void method1(String name , int no) {
		Studentname=name;
		name="mahesh";
		rollno =no;
		no=20;
	System.out.println("name of candidate and his rollno is: "+name +" "+no);
}

	public static void main(String[] args) {
		
		overloading o = new overloading();
		o.method1(Studentname);
		o.method1(Studentname, rollno);
		
		
		
	}

}
