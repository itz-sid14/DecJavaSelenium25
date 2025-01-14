package CollectionInJava;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetInJava {
	
	public static void main(String[] args) {
		
		Set<Float> TS = new TreeSet<>();
		
		TS.add(12.09f);
		TS.add(22.19f);
		TS.add(23.69f);
		TS.add(12.09f);
		//TS.add(null);       // Null and Duplicates values are not allowed in TreeSet 
		
		System.out.println(TS);
	}

}
