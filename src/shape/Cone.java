package shape;

public class Cone extends Shape
{
	private double radius;
	
	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	// Getter and Setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Implement abstract method
	@Override
	public double getBaseArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getVolume() 
	{
		return getBaseArea() * getHeight()/3;
	}
	
	
}
