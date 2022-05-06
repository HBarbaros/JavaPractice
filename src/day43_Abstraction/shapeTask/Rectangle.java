package day43_Abstraction.shapeTask;

public final class Rectangle extends Shape{

    private double width,length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width * length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName() + '\'' +
                ", area= " + area() +
                ", name= " + perimeter() +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}