package MethodsInJava;

public class WiyhReturnType {

	public static void main(String[] args) {

		// Addition of two numbers
		
		int result = additionof2(3,2);
		System.out.println(result);
		
		// Generating the table with sum of 2 numbers

		table(result);
		
		// Printing the table by using array
		
		int [] resultarray1 = arraytable1 (result);
		
		for(int i : resultarray1)
		{
			System.out.println(i);
		}
	}
	
	// Addition of two numbers 

	public static int additionof2(int a, int b)
	{
		return a+b;
	}
	
	// Generating the table with sum of 2 numbers
	
	public static void table(int result)
	{

		for(int i=1; i<=10; i++)
		{
			System.out.println(result + " * " + i + " = "+(result*i));
		}
	}
	
	// Printing the table by using array
	
	public static int[] arraytable1(int result)
	{
		int [] arr = new int [10];
		
		for(int i=1;i<=10;i++)
		{
			arr[i-1] = result * i;
		}
		return arr;
		
	}
	


}
