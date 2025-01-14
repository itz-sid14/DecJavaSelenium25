package decisionMaking;

public class IfElseExample {
	
	public static void main(String[] args) {
		
		int i = 358;
		
		if(i<0)
		{
			System.out.println("i is less than 0 ");
		}
		else if(i>=0 && i<=25)
		{
			System.out.println("The value of i is in between the 0 to 25");
		}
		else if(i>=26 && i<=50)
		{
			System.out.println("The value of i is in between the 26 to 50");
		}
		else if(i>=51 && i<=75)
		{
			System.out.println("The value of i is in between the 51 to 75");
		}
		else if(i>=76 && i<=100)
		{
			System.out.println("The value of i is in between the 76 to 100");
		}
		else
		{
			System.out.println("The value of i is Greater than 100");
		}
			
	}

}
