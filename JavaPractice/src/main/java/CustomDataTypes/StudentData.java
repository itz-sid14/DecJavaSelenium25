package CustomDataTypes;

import java.util.Arrays;

public class StudentData {
	
	String name;
	String Class_Name;
	String Roll_No;
	String [] Subjects;
	
	
	// CUnstructor in Java
	
	public StudentData (String name,String Class_Name,String Roll_No,String [] Subjects)
	{
		this.name= name;
		this.Class_Name =Class_Name;
		this.Roll_No = Roll_No;
		this.Subjects = Subjects;
	}
	
	
	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getClass_Name() {
		return Class_Name;
	}

	public void setClass_Name(String class_Name) {
		Class_Name = class_Name;
	}

	public String getRoll_No() {
		return Roll_No;
	}

	public void setRoll_No(String roll_No) {
		Roll_No = roll_No;
	}


	public String[] getSubjects() {
		return Subjects;
	}


	public void setSubjects(String[] subjects) {
		Subjects = subjects;
	}


	@Override
	public String toString() {
		return "StudentData [name=" + name + ", Class_Name=" + Class_Name + ", Roll_No=" + Roll_No + ", Subjects="
				+ Arrays.toString(Subjects) + "]";
	}
	
	
		
		
	}
	


