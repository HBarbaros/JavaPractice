package day43_Abstraction.shapeTask;

public final class Circle extends Shape {

    private final static double pi;
    private double radius;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    static {
        pi = 3.14;
    }


    public double getPi() {
        return pi;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                ", area= " + area() +
                ", perimeter= " + perimeter() +
                ", radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
