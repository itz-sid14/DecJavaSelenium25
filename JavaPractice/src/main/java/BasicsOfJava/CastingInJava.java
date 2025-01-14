package BasicsOfJava;

public class CastingInJava {
	
	public static void main(String[] args) {
		
		byte b = 11;
		
		short s = 125;
		
		//s = b;   //// Casting 
		
		b = (byte) s; //// Type Casting 
		
		System.out.println(b);
	}

}
