package Abstraction;
public class TVS extends Bike{
void start() {
	System.out.println("TVS bike Model");
}
public static void main(String[] args) {

	Bike b= new TVS();
	String s=b.toString();
	b.start();	
	b.stop();
 	}
}
