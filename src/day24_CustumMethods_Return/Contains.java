package day24_CustumMethods_Return;

public class Contains {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
        int number = 7;
        boolean result = contains(array, number);
        System.out.println(result);


    }

    public static boolean contains(int[] array, int number){

        boolean result = false;
        for (int each : array){
            if (each == number){
                result = true;
            }
        }

        return result;


    }

}

/*
9. Create a method named contains that passes one integer array and
one integer parameters, the method returns true if the given integer is
contained in the given array, otherwise returns false

            Ex:
                arr = {1,2,3,4,5,6,7};
                num = 10;

                contains(arr, num) ===> false
 */