package OOPs;

public class InheritanceImpl {
	
	public static void main(String[] args) {
		
		ParentClass p1 = new ParentClass();
		
		p1.parentMethod1();
		p1.parentMethod2();
		
		
		ChildClass c1 = new ChildClass();
		
		c1.ChildMethod3();
		c1.ChildMethod4();
		c1.parentMethod1();
		
	}

}
