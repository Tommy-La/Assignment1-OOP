package shape;

public class SquarePrism extends Prism {

	
    public SquarePrism(double height, double side) {
        super(height, side);
    }

    // Calculate the base area of the square prism
    @Override
    public double getBaseArea() {
        return getSide() * getSide();
    }

    // Calculate the volume of the square prism
    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}
