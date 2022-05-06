package day23_CustomMethods_Void;

public class Calculator {

    public static void main(String[] args) {

        calculator(10,5,'*');

    }

    public static void calculator(double num1, double num2, char matOperator){

        String result = "";

        if (matOperator == '/' || matOperator == '*' || matOperator == '-' || matOperator == '+'){

            if (matOperator == '/'){
                result = "Division: " + (num1 / num2);
            }else if (matOperator == '*'){
                result = "Multiplication:  " + (num1 * num2);
            }else if (matOperator == '-'){
                result = "Subtraction: " + (num1 - num2);
            }else {
                result = "Addition: " + (num1 + num2);
            }

        }else{
            result = "Invalid Entry!";
        }

        System.out.println(result);


    }

}

/*
15. create a method named calculator that passes three arguments
(num1, num2, mathOperator), prints the calculation result
 */