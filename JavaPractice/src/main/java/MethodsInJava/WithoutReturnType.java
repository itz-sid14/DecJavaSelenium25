package MethodsInJava;

public class WithoutReturnType {

	public static void main(String[] args) {


		Addition(15,30);  //Addition of Two Numbers 
		Addition(20,89);  //Addition of Two Numbers 
		Addition(78,22);  //Addition of Two Numbers 
		
		AddOf3(2,3,5);    //Addition of 3 Numbers

	}

	//Addition of Two Numbers 
	// Method creation
	public static void Addition(int a, int b)
	{
		System.out.println("Sum = "+(a+b));
	}
	
	//Addition of 3 Numbers 
	
	public static void AddOf3(int a, int b, int c)
	{
		System.out.println("Sum of 3 numbers is = "+(a+b+c));
	}

}
