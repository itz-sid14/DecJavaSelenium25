package PracticeSetOf100Programs;

import java.util.Scanner;

public class TableWithUserInputs24_1 {
	
	public static void main(String[] args) {
		
		int a,b,c,d;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter from which number's table should start:");
		a= sc.nextInt();
		System.out.println("Enter last table number: ");
		b= sc.nextInt();
		
		for(c=a;c<=b;c++)
		{
			System.out.println(c);
			
			for(d=1; d<=10;d++)
			{
				System.out.println(c +"*" + d +"="+(c*d));;
				
			}
			System.out.println("=====================");
		}
		
	}

}
