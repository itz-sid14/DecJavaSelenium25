package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapInJava {
	
	public static void main(String[] args) {
		
		Map<String, String> hmap = new HashMap<>();
		
		hmap.put("Username", "Siddharth");
		hmap.put("Password", "Siddharth@1891");
		hmap.put("Site", "hhtps://www.google.com");
		
		System.out.println(hmap);
		
		System.out.println("=========================");
		
		for(Entry<String, String> entrySet:hmap.entrySet())
		{
			System.out.println(entrySet.getKey());
			System.out.println(entrySet.getValue());
			
			System.out.println("=========================");
			
			
		}
		System.out.println(hmap.get("Username"));
		System.out.println(hmap.get("Password"));
		System.out.println(hmap.get("Site"));
		
		hmap.remove("Password");
		
		System.out.println(hmap);
		
		
	
		
	
	}

}
