package PracticeSetOf100Programs;

import java.util.Scanner;

public class FactorialFinding14 {
	
	public static void main(String[] args) {
		
		 int n, i, fact=1;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println(" Enter your number to calculate the factorial =");
		 
		 n = sc.nextInt();
		 
		 if(n < 0)
		 {
			 System.out.println("Enter the non-Negetive number");
		 }
		 else
		 {
			 for(i=1; i<=n; i++)
				 fact= fact*i;
			 
			 System.out.println("The factorial of "+ n + " = "+ fact);
		 }
	}

}
