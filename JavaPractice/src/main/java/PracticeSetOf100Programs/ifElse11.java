package PracticeSetOf100Programs;

import java.util.Scanner;

public class ifElse11 {
	
	public static void main(String[] args) {
		
		int MarksObtained, RequiredMarks;
		
		RequiredMarks=35;
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter marks scored by you = ");
	
	MarksObtained =sc.nextInt();
	
	if(MarksObtained >=RequiredMarks )
	{
		System.out.println("You are passed");
	}
	
	else
	{
		System.out.println("Unfortunately you are failed ");
	}
		
	}

}
