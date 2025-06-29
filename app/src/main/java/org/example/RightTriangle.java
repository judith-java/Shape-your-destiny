public class RightTriangle extends Shape implements Polygon {
    protected double legA;
    protected double legB;

    public RightTriangle(double legA, double legB) {
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    public double getArea() {
        return 0.5 * legA * legB;
    }

    @Override
    public double getPerimeter() {
        return legA + legB + Math.sqrt(legA * legA + legB * legB);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
