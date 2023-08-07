package Interface;
interface classA {
	void showdetails1(String name) ;
}
interface classB {
	void showdetails2(int a);
}
public class interfacedemo implements classA,classB {
	 public void showdetails1(String name) {
		System.out.println("name is : "+name);
	}
	 public void showdetails2(int a) {
		 System.out.println("age is: "+a);
	 }
	public static void main(String[] args) {
		interfacedemo d = new interfacedemo();
		d.showdetails1("mahesh");
		d.showdetails2(29);
	}
}