package ExceptionHandling;

public class UDEImpln {
	
	public static void main(String[] args) throws Exception {
		
		Long mobilenum = 93596985631l;
		
		String str = String.valueOf(mobilenum);
		
		if(str.length() != 10)
		{
			System.out.println("Incorrect Number");
			throw new Exception("Mobile number is not valid");
		}
		
		System.out.println(mobilenum);
	}

}
