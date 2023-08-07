package Java2;

public class test4 {
	// Reverse words 
	public static void main(String[] args) {
		
	String words = "mahesh is a clever boy";
	
	String [] a=words.split(" ");
	
	for(int i=0;i<a.length;i++) {
		
		System.out.print(a[i] + " ");
		
	}
//		for(String b:a) {
//			System.out.print(b+ " ");
//		}
	System.out.println("");
	
	for (int i=a.length-1;i>=0;i--) {
		
			System.out.print(a[i] + " ");
	}
	
	
		
		
		
		
	}

}
