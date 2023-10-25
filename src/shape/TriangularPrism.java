package shape;

public class TriangularPrism extends Prism {

    public TriangularPrism(double height, double side) {
        super(height, side);
    }

    // Calculate the base area of the triangular prism
    @Override
    public double getBaseArea() {
        return (getSide() * getSide() * Math.sqrt(3)) / 4;
    }

    // Calculate the volume of the triangular prism
    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}
