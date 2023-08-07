package javac1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class collection {

	public static void main(String[] args) {
		
		 Map<String, Integer> add = new HashMap<>();
		 
		 add.put("akshay",1);
		 add.put("mahesh",2);
		 add.put("saurabh",3);
		 add.put("shubham",4);	
		 add.put("kanaiya",5);
		 add.put("swapnil",6);
		
		System.out.println(add);
		
	            for (Map.Entry<String, Integer> entry : add.entrySet()) {
	                String key = entry.getKey();
	                Integer name = entry.getValue();
	                  
	                System.out.println("Key: " + key + ", Name: " + name);
	            }
	        }
	}

	  


