package CollectionInJava;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetInJava {
	
	public static void main(String[] args) {
		
		Set<Integer> LHS = new LinkedHashSet<>();
		
		
		LHS.add(1);
		LHS.add(2);
		LHS.add(4);
		LHS.add(3);
		LHS.add(6);
		LHS.add(null);
		LHS.add(1);    // NUll are allowed // Duplicates are not allowed
		
		System.out.println(LHS);
		
		
	}

}
