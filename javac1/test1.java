package javac1;

import java.util.ArrayList;
import java.util.List;

public class test1 {

	public static void main(String[] args) {

/*take a list containing numbers of element 
	fetch the output in the number of list 
	conditions:
	1) list contain three element 
	2) with the combination of zeroth and first index addition will be 
	   reflected on the third position
	3) and all those three elements should be present in the input list.
*/
		
		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9);
		
		List<List<Integer>> result = new ArrayList<>();
		
		for (int i=0 ; i<8;i++) {
			
			List<Integer> a= new ArrayList<>();
			
			a.add(list.get(i));
			
			a.add(list.get(i+1));
			
			result.add(a);
		
		if (list.size()>result.size()) {
			
			a.add(list.get(i)+list.get(i+1));
			
			result.add(a);
			
			System.out.println(result.get(i));
		}
		}
	}
}
