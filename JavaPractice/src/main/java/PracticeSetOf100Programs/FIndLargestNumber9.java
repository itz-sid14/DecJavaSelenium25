package PracticeSetOf100Programs;

import java.util.Scanner;

public class FIndLargestNumber9 {
	
	public static void main(String[] args) {
		
		int num1 , num2, num3;
		
		System.out.println("Enter three integer numbers");
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 >num2 && num1 > num3)
		{
			System.out.println(" num1 has largest number ");
			
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println(" num2 has largest number ");

		}
		else if(num3 > num1 && num3 > num2)
		{
			System.out.println(" num3 has largest number ");

		}
		else
		{
			System.out.println(" Entered numbers are not distinct");
			
		}
	}

}
