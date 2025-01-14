package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapInJava {

	public static void main(String[] args) {

		Map<String, String> tmap = new TreeMap<>();

		
		tmap.put("Password", "Siddharth@1891");
		tmap.put("Site", "hhtps://www.google.com");
		tmap.put("City", "Pune");
		tmap.put("name", "Siddharth");

		System.out.println(tmap);

	}
}
