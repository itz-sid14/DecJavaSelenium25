package OOPs;

public class PolymorphismInJava {
	
	public static void main(String[] args) {
		
//		AccountExample ae= new AccountExample("Union Bank Of India", 78748478445l,78888.00f);
//		
//		System.out.println(ae);
//		
//		System.out.println(ae.getData(78748478445l, 0));
//		System.out.println(ae.getData(""));
		
		System.out.println(multiply(2,5));
		System.out.println(multiply(2,5,9));
		System.out.println(multiply(new int []{5,2,3,2,5,4,6,3}));
	}
	
	public static int multiply(int a, int b)
	{
		return a*b;
	}
	
	public static int multiply(int a, int b, int c)
	{
		return a*b*c;
	}
	
	public static int multiply(int [] arr)
	{
		int result = 1;
		
		for(int a : arr)
		{
			result = result * a;
		}
		
		return result;
	}


}
