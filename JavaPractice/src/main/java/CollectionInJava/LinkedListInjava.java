package CollectionInJava;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInjava {
	
	public static void main(String[] args) {
		
		List<Float> data = new LinkedList<>();
		
		data.add(12.50f);
		data.add(52.23f);
		data.add(78.43f);
		data.add(32.12f);
		data.add(48.63f);
		
		System.out.println(data);
		
		// To fetch the particular data
		
		System.out.println(data.get(3));
		
		// To remove the particular data
		
		System.out.println(data.remove(2));
		
		System.out.println(data);
		
	}

}
