package CollectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<String> states = new ArrayList<>();
		
		states.add("Maharastra");
		states.add("Karanataka");
		states.add("Tamilnadu");
		states.add("Andhra Pradesh");
		states.add("Chattisgad");
		states.add("Madhya Pradesh");
		states.add("Uttar Pradesh");
		states.add("Jharkhand");
		states.add("Goa");
		states.add("Delhi");
		states.add("Manipur");
		
		System.out.println(states);
		
		System.out.println("Printing result below with for each loop : ");
		
		// Printing with for each loop
		
		for(String s: states)
		{
			System.out.println(s);
		}
		
		// Printing with Iterator
		System.out.println("Printing result below with Iterator : ");

		Iterator <String> itr =  states.iterator() ;
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		// Functions
		states.removeFirst();
		System.out.println(states);
		
		states.removeLast();
		System.out.println(states);
	}

}
