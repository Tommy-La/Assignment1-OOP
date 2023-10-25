package shape;

public class OctagonalPrism extends Prism {

	public OctagonalPrism(double height, double side) {
        super(height, side);
    }
	
	// Calculate the base area of the octagonal prism
    @Override
    public double getBaseArea() {
        return 2 * (1 + Math.sqrt(2)) * getSide() * getSide();
    }
    
    // Calculate the volume of the octagonal prism
    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}
