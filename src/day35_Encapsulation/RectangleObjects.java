package day35_Encapsulation;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2.5, 5);
        System.out.println(rectangle);

        rectangle.setWidth(5);
        rectangle.setLength(10);

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        System.out.println(rectangle);


    }

}
