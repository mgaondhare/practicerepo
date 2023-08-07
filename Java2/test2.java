package Java2;

public class test2 {
	// count words
	
	public static void main(String[] args) {
	
		String words = "mahesh is a clever boy";
//
//		int count = words.split(" ").length;
//		
//		System.out.println(count);
		String[]a=words.split(" ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n");
		for (int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+ " ");
		
		}
	}

}
