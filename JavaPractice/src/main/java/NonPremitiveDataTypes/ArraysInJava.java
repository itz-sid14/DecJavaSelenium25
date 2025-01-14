package NonPremitiveDataTypes;

public class ArraysInJava {
	
	public static void main(String[] args) {
		
		
		String str[] = {"Apple", "Pineapple", "Mango", "Banana", "Orange"};
		
		System.out.println(str[0]);
		System.out.println(str[2]);
		System.out.println(str[4]);
		System.out.println(str[1]);
		System.out.println(str[3]);
		
	System.out.println("========================================================");	
		
		// Another way of declaring arrays 
		
		String str1 [] = new String [5];
		
		str [0] = "Pune";
		str [1] = "Solapur";
		str [2] = "Nagpur";
		str [3] = "Mumbai";
		str [4] = "Parbhani";
		
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		
		System.out.println(str1.length);
	}

}
