package shape;

public class PentagonalPrism extends Prism {

    public PentagonalPrism(double height, double side) {
        super(height, side);
    }

    // Calculate the base area of the pentagonal prism
    @Override
    public double getBaseArea() {
        return (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * getSide() * getSide()) / 4;
    }

    // Calculate the volume of the pentagonal prism
    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}
