package OOPs;

public class Square implements Shape{
	
	private float side;
	
	
	public Square(float side) {
		super();
		this.side = side;
	}
	
	

	public float getSide() {
		return side;
	}


	public void setSide(float side) {
		this.side = side;
	}


	@Override
	public float area() {
		// TODO Auto-generated method stub
		return this.side * this.side;
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return 4.00f * this.side;
	}
	
	

}
