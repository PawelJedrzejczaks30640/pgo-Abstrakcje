public class Rectangle implements Figure {
    private  double sideA;
    private  double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {

        return this.sideA * this.sideB;
    }

    public double getPerimeter() {

        return 2 * this.sideA + 2 * this.sideB;
    }

    public String getType() {

        return this.getClass().getName().toString();
    }
}