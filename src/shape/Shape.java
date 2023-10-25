package shape;

public abstract class Shape implements Comparable<Shape>
{
	//atributes
	private double height;
	
	public Shape(double height) {
		this.height = height;
	}
	
	//getters/setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//methods
	public abstract double getVolume();
	
	public abstract double getBaseArea();
	
	public int compareTo(Shape that) {
		if (this.height < that.height) {
			return -1;
		}
		if (this.height > that.height) {
			return 1;
		}
		return 0;
	}
	
	@Override
    public String toString() {
        return "Shape - Height: " + height;
    }

}
