package Javac;

public class multiArray {

	public static void main(String[] args) {
		
		int[][]a= {{10,11},{12,13},{14,15}};
		
		//read values of array
		
//		for(int i=0;i<a.length;i++) 
//		{
//			for (int j=0;j<a[0].length;j++)
//			{
//			System.out.println(a[i][j]);
//		}
//	}  // inhance for loop method
		for (int[] i:a) {
			for (int j:i) {
				System.out.println(j);
			}
				
		}
	}
}