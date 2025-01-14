package Loops;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		int i=10;
		
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
		
		System.out.println(" Do-While-Loop");
		
		//reseting the i again to 10..
		i=10;
		do
		{
			System.out.println(i);
			i--;
		}
		while(i>0);
			
	}

}
