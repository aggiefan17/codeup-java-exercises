package shapes;

public class Square extends Quadrilateral{

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    void setLength(double side) {
        setWidth(side);
    }

    @Override
    void setWidth(double side) {
        width = side;
        length = side;
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

}
