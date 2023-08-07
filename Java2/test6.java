package Java2;

public class test6 {

	public static void main(String[] args) {		
		
		
		
		for (int i=0;i<=5;i++) {
	//		k=0;k<=i;k++
			
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			
			//j=5;j>i;j--
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}		
}