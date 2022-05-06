package day33_Statics;

public class IphoneObjects {

    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("13 Pro", 1000, "Black", 6.1);
        System.out.println(iPhone1);

        System.out.println(iPhone1.brand);
        System.out.println(iPhone1.OS);
        System.out.println(iPhone1.madeIn);

        iPhone1.faceTime(736460947);
        iPhone1.faceTime("hbarbaros06@gmail.com");
        iPhone1.call(736460947);
        iPhone1.text(736460947);






    }

}
