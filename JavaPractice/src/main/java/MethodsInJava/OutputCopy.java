package MethodsInJava;

public class OutputCopy {

	public static void main(String[] args) {

		String str = "java";
		
		System.out.println(first3(str));		
		
	}
	
	public static String first3(String str)
	{
		StringBuilder sb = new StringBuilder();

		if(str.length()>=3)
		{
			for(int i=0; i<3; i++)
			{
				sb.append(str.substring(0,3));
			}
		}
		else 
		{
			for(int i=0; i<3; i++)
			{
				sb.append(str);
			}			
	}
		return(sb.toString());
	}

}
