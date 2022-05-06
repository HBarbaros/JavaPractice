package Quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class quiz_14042022 {


    public static class Test {

       public Test(){
           System.out.println("A ");
       }

       public Test(int a){
           this(2.5);
           System.out.println("B ");
       }

       public Test(double c){
           this();
           System.out.println("C ");
       }

        public static void main(String[] args) {
            Test obj = new Test(100);
        }

    }

    public static class Test1 {

        public Test1(){
            System.out.println("Developer");
        }

        public void Test(){
            System.out.println("SDET");
        }

        public static void main(String[] args) {
            Test1 test1 = new Test1();
        }

    }

    public static class Test2 {

        public static void main(String[] args) {

            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);

            int a = 1;
            list1.remove(a);

            System.out.println(list1);

        }


    }

    public static class Test3 {

        public static void main(String[] args) {

            ArrayList<String> color = new ArrayList<>();
            color.add("green");
            color.add("red");
            color.add("blue");
            color.add("yellow");
            color.add(3, "cyan");

            System.out.println(color);

        }

    }

    public static class Test4 {

        public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>();
            Integer a = 1;
            System.out.println(list.remove(a));
        }

    }

    public static class Test5 {

        public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5));

            list.set(0, list.get(4));
            list.set(4, list.get(0));

            System.out.println(list);

        }

    }

    public static class Test6 {

        public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,7));

            for(Integer each : list){
                if(each % 2 != 0){
                    continue;
                }
                System.out.println(each + " ");
                break;
            }

        }

    }
}

    /* Constructor methods can be overloaded

    In Java, we can overload constructors like methods. The constructor overloading can be defined as the concept
    of having more than one constructor with different parameters so that every constructor can perform a different task.
     */

    /*
    A constructor method can have a return-type in the method signature

    No, constructor does not have any return type in Java. Constructor looks like method but it is not.
    It does not have a return type and its name is same as the class name.
     */