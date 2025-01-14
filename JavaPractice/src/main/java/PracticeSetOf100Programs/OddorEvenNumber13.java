package PracticeSetOf100Programs;

import java.util.Scanner;

public class OddorEvenNumber13 {
	
	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number you want to check if it is even or odd number= ");
		
		x= sc.nextInt();
		
		if(x % 2 ==0)
		{
			System.out.println(" Entered number is Even number.");
		}
		else 
		{
			System.out.println(" Entered number is Odd number.");
		}
	}

}
