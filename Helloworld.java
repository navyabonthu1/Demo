package Demo;
import java.util.*;
public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		int n = 10;
		System.out.println(n);
		
		List<Integer> L = new ArrayList<>();
		
		L.add(12);
		L.add(13);
		L.add(14);
		L.add(15);
		for(int index=0; index < L.size(); index++ ){
			
			System.out.println(L.get(index));
		}

	}

}