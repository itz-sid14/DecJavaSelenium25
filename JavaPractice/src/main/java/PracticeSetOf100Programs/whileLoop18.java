package PracticeSetOf100Programs;

import java.util.Scanner;

public class whileLoop18 {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number =");
		
		n= sc.nextInt();
		
		while(n !=2)
		{
			System.out.println("You have entered = "+ n);
			System.out.println("Enter the number =");
		}
		System.out.println("out of loop");
	}

}
