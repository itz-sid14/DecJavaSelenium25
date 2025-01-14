package CollectionInJava;

import java.util.Iterator;
import java.util.Vector;

public class VectorInJava {
	
	public static void main(String[] args) {
		
		Vector<String> str = new Vector<>();
		
		str.add("Mumbai");
		str.add("Pune");
		str.add("Nagpur");
		str.add("Thane");
		str.add("Nashik");
		str.add("Aurangabad");
		str.add("Solapur");
		
		Iterator<String> itr = str.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println(str.reversed());

		


		
	}

}
