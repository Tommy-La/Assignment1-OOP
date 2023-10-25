package shape;

public class Pyramid extends Shape
{
	// Attributes
	private double side;

	// Constructor
    public Pyramid(double height, double side) {
        super(height);
        this.side = side;
    }

    // Getter and Setter
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	 @Override
	 public double getBaseArea() {
	    return side * side;
	 }	
	
	 @Override
	 public double getVolume() {
	    return getBaseArea() * getHeight() / 3;
	 }
}
