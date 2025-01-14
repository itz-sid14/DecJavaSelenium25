package Strings;

public class ReverseStringExample {

	public static void main(String[] args) {

		String str = "CUP";

		//Type 1 - Recommended

		for(int k=str.length()-1;k>=0; k--)
		{
			System.out.print(str.charAt(k));
		}
		
		// Type 2
		char[] ch= str.toCharArray();

		System.out.println(ch);

		for(int i= ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();


	}

}
