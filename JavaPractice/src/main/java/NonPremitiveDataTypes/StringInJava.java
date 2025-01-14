package NonPremitiveDataTypes;

public class StringInJava {
	
	public static void main(String[] args) {
		
		String str = "Hi I am Siddharth";
		
		System.out.println(str);
		
		System.out.println(str.length());
		System.out.println(str.contains("Siddharth"));
		System.out.println(str.indexOf("am"));
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		System.out.println(str.replace("Siddharth", "Java Operator"));
	}

}
