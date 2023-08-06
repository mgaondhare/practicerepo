package Javac;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		// we use only object in list like Integer | String | Float | Boolean  not datatypes
		// add into list
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		
		// print specific index value
		int index2=list.get(2);
	System.out.println(index2);
	
		// Add index+value
		list.add(0,0);
		System.out.println(list);

		
		// replace index value
		list.set(6, 12);
		System.out.println(list);
		
		// remove value from list
		list.remove(6);
		System.out.println(list);
		
		// get size of list
		System.out.println(list.size());
		
		// use loop on list
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		
		// sort list
		Collections.sort(list);
		System.out.println("--------------------------------");
		System.out.println(list);
	}

	
	
	
	
}
