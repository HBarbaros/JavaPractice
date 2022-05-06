package Utilities;

public class ArrayUtilityTask2_Day25 {

    //  1. create a method that can return the max number from an integer array
    public static int max(int[] numbers){

        /*Arrays.sort(numbers);
        return numbers[numbers.length-1];
         */

        int max = numbers[0];
        for (int each : numbers) {
            if (each > max){
                max = each;
            }
        }
        return max;

    }

    //  2. create a method that can return the max number from double array
    public static double max(double[] numbers){

        /*Arrays.sort(numbers);
        return numbers[numbers.length-1];
         */

        double max = numbers[0];
        for (double each : numbers) {
            if (each > max){
                max = each;
            }
        }
        return max;

    }

    //  3. create a method that can return the max number from long array
    public static long max(long[] numbers){
        long max = numbers[0];
        for (long each : numbers) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }

    // 4. create a method that can return the max number from short array
    public static short max(short[] numbers){

        short max = numbers[0];
        for (short each : numbers) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }

    // 5. create a method that can return the max number from float array
    public static float max(float[] numbers){
        float max = numbers[0];
        for (float each : numbers) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }

    // 6. create a method that can return the max number from byte array
    public static byte max(byte[] numbers){
        byte max = numbers[0];
        for (byte each : numbers) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }


}
