package day43_Abstraction.shapeTask;

public class ShapeObject {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.5, 3.5);

        Square square = new Square(8);

        Circle circle = new Circle(2);

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);


    }

}
