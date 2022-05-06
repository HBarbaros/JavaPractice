package day35_Encapsulation;

public class SquareObjects {

    public static void main(String[] args) {

        Square square = new Square(6);
        System.out.println(square);

        square.setSide(10);
        System.out.println(square.getSide());

        System.out.println(square);


    }

}
