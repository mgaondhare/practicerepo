package Abstraction;

public class Honda extends Bike {

	Honda() {
		System.out.println("Honda bike Model");
	}
	
	public static void main(String[]args) {
		
		Bike b2 = new Honda();
		b2.toString();
		b2.start();
		b2.stop();
		
		
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
