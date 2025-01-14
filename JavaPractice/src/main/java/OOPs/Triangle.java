package OOPs;

public class Triangle implements Shape{
	
	
	private float lenghth;
	
	private float breadth;
	
	private float height;

	public Triangle(float lenghth, float breadth, float height) 
	{
		super();
		this.lenghth = lenghth;
		this.breadth = breadth;
		this.height = height;
	}

	public float getLenghth() {
		return lenghth;
	}

	public void setLenghth(float lenghth) {
		this.lenghth = lenghth;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0.5f * this.lenghth * this.breadth;
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return this.lenghth + this.breadth + this.height;
	}
	
	
	
//	public float area()
//	{
//		return 0.5f * this.lenghth * this.breadth;
//	}
//	
//	public float perimeter()
//	{
//		return this.lenghth + this.breadth + this.height;
//	}

}
