package Java2;
public class test5 {
//	 draw pattern  			*
//	 					   * *
//	 					  * * *
//	 					 * * * *
//	 					* * * * *
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
//			int k=1;k<=i;k++   for  * * * * *
//									 * * * *
//									  * * *	
//									   * *
//									    *
									   
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
		// int	j=5;j>i;j--
			for (int k=1;k<=i;k++) {
				System.out.print("* ");
			}
		System.out.print("\n");
		
		}
	}
}