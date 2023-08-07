package javac1;

public class test4 {

	public static void main(String[] args) {
	
		int [] a= {1,3,5,8};
		String []b= {"Mahesh","Suresh","Akshay"};
		
//		for(int i=0; i<a.length;i++) {
//		System.out.print(a[i]);
//	}
		
		for(int value:a) {
			System.out.println(value);
		}
		
		for(String value1:b) {
			System.out.println(value1);
		}
		
	}
}
