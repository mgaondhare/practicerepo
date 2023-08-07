package Abstraction;

public class Bajaj extends Bike{


	void start() {
		System.out.println("Bajaj bike Model");
	}

	public static void main(String[] args) {
		
		Bike b1=new Bajaj();
		b1.toString();
		b1.start();
		b1.stop();
	}
	
}
