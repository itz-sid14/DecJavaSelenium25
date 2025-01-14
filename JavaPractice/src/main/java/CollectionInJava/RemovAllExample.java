package CollectionInJava;

import java.util.HashSet;
import java.util.Set;

public class RemovAllExample {
	
	public static void main(String[] args) {

		Set<String> hset1 = new HashSet<>();

		hset1.add("One");
		hset1.add("Two");
		hset1.add("Null");
		hset1.add("Three");
		hset1.add("Six");

		System.out.println(hset1);

		Set<String> hset2 = new HashSet<>();

		hset2.add("Null");
		hset2.add("Two");
		hset2.add("One");
		hset2.add("Four");

		System.out.println(hset2);
		
		hset1.removeAll(hset2);
		
		System.out.println(hset1);



	}


}
