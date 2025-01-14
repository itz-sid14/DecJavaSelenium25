package PracticeSetOf100Programs;

import java.util.Scanner;

public class NestedIfElse12 {

	public static void main(String[] args) {

		int marksObtained, marksRequired;

		char grade;

		marksRequired=45;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks scored by you = ");

		marksObtained = sc.nextInt();
		
		if(marksObtained >= marksRequired)
		{
			if(marksObtained >90)
			
				grade ='A';
			
			else if(marksObtained >75)
			
				grade = 'B';
			
			else if(marksObtained >60)
			
				grade = 'C';
			
			else
			
				grade = 'D';
				
				System.out.println("You have successfully passed the exam and your Grade is :" + grade);
			
		}
			else 
			{
				grade = 'F';
				System.out.println("Unfortunately you are failed and your Grade is: "+grade);
			}
		}
	}

