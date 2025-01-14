package MethodsInJava;

public class MethodsExample {

	public static void main(String[] args) {

		String str = "Kitten";

		int index = 4;
		
		System.out.println(missingchar(str,index));



	}
	public static String missingchar(String str, int index)

	{
		int iterator = 0;

		StringBuilder sb= new StringBuilder();

		for(char c: str.toCharArray())
		{
			if(index == iterator)
			{
				iterator++;
				continue;
			}
			//System.out.println(c);
			sb.append(c);
			iterator++;

		}
		return sb.toString();

	}
	

}
