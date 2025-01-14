package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapInJava {

	public static void main(String[] args) {

		Map<String, String> lhmap = new LinkedHashMap<>();

		lhmap.put("Username", "Siddharth");
		lhmap.put("Password", "Siddharth@1891");
		lhmap.put("Site", "hhtps://www.google.com");
		lhmap.put("City", "Pune");

		System.out.println(lhmap);

	}

}
