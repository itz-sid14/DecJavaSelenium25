package CollectionInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AddAllExample {

	public static void main(String[] args) {


		Set<String> hset1 = new HashSet<>();

		hset1.add("One");
		hset1.add("Two");
		hset1.add("Null");
		hset1.add("Three");

		System.out.println(hset1);

		Set<String> hset2 = new HashSet<>();

		hset2.add("Null");
		hset2.add("Two");
		hset2.add("One");
		hset2.add("Four");

		System.out.println(hset2);

		hset1.addAll(hset2);

		System.out.println(hset1);
		
		// Alphabetically Sorting the results by using List
		
		List<String> list =new ArrayList<>();
		
		list.addAll(hset1);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		// Alphabetically Sorting the results by using TreeSet

		Set<String> tset = new TreeSet<>();
		
		tset.addAll(hset1);
		
		
		System.out.println(tset);
		



	}

}
