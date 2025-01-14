package CustomDataTypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentImp {
	
	public static void main(String[] args) {
		
		StudentData sd = new StudentData("Sanjay", "11", "14", new String[] {"English","Marathi", "Hindi"});
		
//		sd.name ="Sanjay";
//		sd.Class_Name ="11th";
//		sd.Roll_No ="14";
//		sd.Subjects= new String []{"English","Marathi", "Hindi"};
//		
		sd.setName("Aditya");
		System.out.println(sd.getClass_Name());
		System.out.println(sd.getName());
		System.out.println(sd.getRoll_No());
		
		for(String s: sd.getSubjects())
			{
			System.out.println(s);
			}
		
		StudentData sd2 =new StudentData ("Raja", "5th", "35", new String[] {"English","Marathi", "Hindi"});
		StudentData sd3 =new StudentData ("Jindal", "12th", "12", new String[] {"English","Marathi", "Hindi"});
		StudentData sd4 =new StudentData ("Shyam", "9th", "68", new String[] {"English","Marathi", "Hindi"});
		StudentData sd5 =new StudentData ("Bob", "3th", "30", new String[] {"English","Marathi", "Hindi"});

		System.out.println(sd2);
		System.out.println(sd);
		
		System.out.println("=====================================");
		
		StudentData [] arr= new StudentData[5];
		
		arr[0] = sd;
		
		List<StudentData> sdList = new ArrayList<>();
		
		sdList.add(sd2);
		sdList.add(sd3);
		sdList.add(sd4);
		sdList.add(sd5);
		
		Iterator itr = sdList.iterator();
		
		while(itr.hasNext())
		{
			StudentData s =(StudentData) itr.next();
			System.out.println(s.getName());
			System.out.println(s.getClass_Name());
			System.out.println(s.getRoll_No());
			
			
			
			for(String s1: sd.getSubjects())
				{
				System.out.println(s1);
				}
			System.out.println();
			
			System.out.println("=========================");
		}
		
		
		
	}

}
