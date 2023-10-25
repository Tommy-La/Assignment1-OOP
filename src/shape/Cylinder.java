package shape;

public class Cylinder extends Shape
{
	private double radius;

	// Constructor
    public Cylinder(double height, double radius) {
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

	// Implement abstract methods
	@Override
    public double getBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }
	
	@Override
	public double getVolume() {
        return getBaseArea() * getHeight();
    }
	
}
