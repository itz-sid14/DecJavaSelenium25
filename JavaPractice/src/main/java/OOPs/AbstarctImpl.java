package OOPs;

public class AbstarctImpl {
	
	public static void main(String[] args) {
		
		AbstractDemo ad = new AbstractDemo(3,4);
		
		System.out.println(ad.Area());
		System.out.println(ad.Perimeter());
	}

}
