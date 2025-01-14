package MethodsInJava;

public class SequenceChange {
	
	public static void main(String[] args) {
		
		String str = "Jump";
		
		//return sb.toString();
		System.out.println(FrontBack(str));
		

	}
	public static String FrontBack (String str)
	{
		StringBuilder sb = new StringBuilder();
		
		if (str.length()<2)
		{
			System.out.println(str);
		}
		else
		{
			sb.append(str.charAt(str.length()-1));
			sb.append(str.substring(1,str.length()-1));
			sb.append(str.charAt(0));
		}
		return sb.toString();
	}

}
