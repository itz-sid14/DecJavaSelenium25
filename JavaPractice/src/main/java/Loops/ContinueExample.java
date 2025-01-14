package Loops;

public class ContinueExample {
	
	public static void main(String[] args) {
		
		for(int i=0; i<11; i++)
		{
			if(i>5 && i<8)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
