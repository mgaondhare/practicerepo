package javac1;

import java.util.ArrayList;

import Javac.Arraylist;

public class list {

	public static void main(String[] args) {
	
//		ArrayList < Integer> list = new ArrayList();
//		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//	
//		System.out.println(list.contains(7));
//	
//		System.out.println(list);
//		
//		
//		Object[] listArray = list.toArray();
//		
//		System.out.println("araylist is: ");
//	
//		for(Object a:listArray) {
//			
//			System.out.print(a);
//		}
//		
		
		ArrayList < String> list1=new ArrayList();
		
		list1.add("mahesh");
		list1.add("akshay");
		list1.add("suresh");
		list1.add("swapnil");
		list1.add("shubham");
		
		
		System.out.println(list1);
		
		
		String [] arraylist = list1.toArray(new String[0]);
		
		for (String a: list1) {
			System.out.print(a+" ");
		}
		
	}

}
