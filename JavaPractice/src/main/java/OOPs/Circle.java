package OOPs;

public class Circle implements Shape{
	
	private float radius;
	

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}



	public void setRadius(float radius) {
		this.radius = radius;
	}


	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 3.14f * this.radius * this.radius;
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return 6.28f * this.radius;
	}
	
	
	
	

}
