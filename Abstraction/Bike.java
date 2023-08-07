package Abstraction;
public abstract class Bike {
	 Bike() {
		System.out.println("Bike is Started");
	}
	abstract void start();
	void stop() {
		System.out.println("bike stop");
	}
}
