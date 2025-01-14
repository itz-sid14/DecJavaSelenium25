package CollectionInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListInJava {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(23);
		list.add(25);
		list.add(75);
		
		System.out.println(list);
		
		list.remove(3);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.contains(12));
		
		
		//Convert List into Array
		
		Object [] arr= list.toArray();
		
		for(Object s: arr)
		{
			System.out.println(s);
		}
		
		//Array into List
		
		List <Object> list2 = Arrays.asList(arr);
		
		System.out.println(list2);
		
		
		
 	}

}
