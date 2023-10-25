package shape;

public abstract class Prism extends Shape {
    // Attributes
    private double side;

    public Prism(double height, double side) {
        super(height);
        this.setSide(side);
    }

    // Getters/Setters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
    // Abstract methods
    public abstract double getVolume();
    
    public abstract double getBaseArea();


}


