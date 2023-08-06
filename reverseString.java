package Javac;
public class reverseString {
	public static void main(String[] args) {
		String a= "mahesh is a clever boy";
		String[] rev =a.split(" ");
		String result="";
		for(int i=(rev.length-1);i>-1;i--) {
			result+=" "+rev[i];
		}
		System.out.println(result);
	}
}