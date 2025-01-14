package PracticeSetOf100Programs;

import java.util.Scanner;

public class WhileBreakAndContinue21 {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the number ");
			n = sc.nextInt();	
			
			if(n !=0)
			{
				System.out.println("You entered a " + n);
				
				System.out.println("====================");
				continue;
			}
			else
			{
				break;
			}
		}
		System.out.println("Out of loop");
		
	}

}
