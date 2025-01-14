package Loops;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		
		String str = "Siddharth ovhal";
		
		// For loop
//	for(int i=0; i<str.length();i++)
//		{
//			System.out.println(str.charAt(i));
//		}
		
		// For each loop
		for(char c:str.toCharArray())
		{
			System.out.println(c);
		}
		
		
	}
}
