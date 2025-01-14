package PracticeSetOf100Programs;

import java.util.Scanner;

public class WhileBreak20 {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter number ");
			n= sc.nextInt();
		
		if(n==0)
		{
			break;
			
		}
		System.out.println("You entered "+ n);
		System.out.println("==========================");

		}
		System.out.println("out of loop");
	}

}
