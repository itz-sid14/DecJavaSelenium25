package ExceptionHandling;

import java.util.Scanner;

public class ExceptionsInJava {
	
	public ExceptionsInJava(String message) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String str [] = new String [2];
		
		
		
		
		try
		{
			System.out.println(str[2]);
		}
		catch(Exception ex)
		{
			System.out.println("Exception Occured :" + ex.getMessage());
		}
		finally
		{
			System.out.println("Print any how ");
		}
		
		// Exceptions of Arithmetic values 
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println(" Enter your number");
		
		i = sc.nextInt();
		
		System.out.println(i);
		
		//System.out.println(12/0);
		
	}

}
