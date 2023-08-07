package javac1;
import java.util.ArrayList;
import java.util.List;
public class sort_list_values_in_multiple_list {
	public static void main(String[] args) {
	
		//use list interface and add multiple integer values
		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9);
		
		//create another Sublist interface which can hold the final result
		List<List<Integer>> result = new ArrayList<>();
		
		//use for loop for giving conditions
		for (int i=0 ; i<8;i++) {
			
		// convert list into Arraylist and store values in it	
			List<Integer> a= new ArrayList<>();
			
		// add values in a variable w.r.t index	
			a.add(list.get(i));
	
			// add values in second index	
			a.add(list.get(i+1));
			
		//add value in third index plus do addition 
			a.add(list.get(i)+list.get(i+1));
			//add value in fourth index plus do addition 
	//		a.add(list.get(i)+list.get(i+1)+list.get(i)+list.get(i+1));
			
		// revert back value to the result variable...
			result.add(a);
			
		// print result w.r.t.indexes	
			System.out.println(result.get(i));
		
		}	
	}
}
