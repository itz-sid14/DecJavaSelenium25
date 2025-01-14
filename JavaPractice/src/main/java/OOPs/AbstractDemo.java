package OOPs;

public class AbstractDemo extends Abstraction {

	//Rectangle calculation
	
	private float length;
	
	private float width;
	
	
	public AbstractDemo(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	

	public float getLength() {
		return length;
	}



	public void setLength(float length) {
		this.length = length;
	}



	public float getWidth() {
		return width;
	}



	public void setWidth(float width) {
		this.width = width;
	}



	@Override
	float Area() {
		// TODO Auto-generated method stub
		return this.length * this.width;
	}

	@Override
	float Perimeter() {
		// TODO Auto-generated method stub
		return 2 * (this.length + this.width);
	}
	
	

}
