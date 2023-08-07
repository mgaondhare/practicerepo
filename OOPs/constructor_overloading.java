package OOPs;

public class constructor_overloading {

	constructor_overloading(int a){
		System.out.println(a);			// constructor overloading
	}
	constructor_overloading(String b){
		System.out.println(b);
	}
	constructor_overloading(int c,int d){
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		constructor_overloading p=new constructor_overloading(23);
		
		constructor_overloading q=new constructor_overloading("mahesh");
		
		constructor_overloading r=new constructor_overloading(23,25);
		
	}
}
