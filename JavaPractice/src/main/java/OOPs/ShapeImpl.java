package OOPs;

public class ShapeImpl {
	
	public static void main(String[] args) {
		
		Shape st = new Triangle (12,15,20);
		
		Shape sc = new Circle (5);
		
		Shape ss = new Square(10);
		
		System.out.println(st.area());
		System.out.println(st.perimeter());
		
		System.out.println(sc.area());
		System.out.println(sc.perimeter());
		
		System.out.println(ss.area());
		System.out.println(ss.perimeter());
	}

}
