package OOPs;

class bank {
	
	int getrateofinterest() {
		return 5;
	}						// method overriding..
}
class SBI extends bank {
	int getrateofinterest() {
		return 8;
	}
}
class BOI extends bank{		
	int getrateofinterest() {		// method definition must be same
		return 12;				// you can implement the method body
	}
}
public class method_overriding {
	public static void main(String[] args) {

		SBI s= new SBI();
		System.out.println(s.getrateofinterest());
		
		BOI i =new BOI();
		System.out.println(i.getrateofinterest());
		
	}

}
