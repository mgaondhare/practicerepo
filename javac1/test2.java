package javac1;
import java.util.ArrayList;
import java.util.List;
public class test2 {
	public static void main(String[] args) {
		
		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9);
		
		for (int i=0  ; i<list.size()-1;i++) {
			
		for (int j=i+1;j<list.size()   ;j++) {
				
			List<Integer> a= new ArrayList<>();
			int sum=list.get(i)+list.get(j);

		if (list.contains(sum)) {
			a.add(list.get(i));
			a.add(list.get(j));
			a.add(sum);
			a.remove(list.get(i));
			a.remove(list.get(i));
			System.out.println(a);
			}
		}
	}
}
}
