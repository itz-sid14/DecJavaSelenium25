package PracticeSetOf100Programs;

import java.util.Scanner;

public class MulTable24 {
	
	public static void main(String[] args) {
		
		int c,n;
		
		System.out.println("Enter the number whose multiplication table you want ");
		
		Scanner sc= new Scanner(System.in);
		
		n= sc.nextInt();
		System.out.println("Multiplication table of" + n +"is as below  : ");
		
		
		for(c=1; c<=10; c++)
		{
			System.out.println(n +"*" + c + " = "+(n*c));
		}
	}

}
