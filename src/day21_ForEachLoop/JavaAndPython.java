package day21_ForEachLoop;

public class JavaAndPython {

    public static void main(String[] args) {

        String[] sentence = {"Java", "Python", "Java", "Java", "Java", "Python", "Python"};

        int countJava =0;
        int countPython =0;

        for (String each : sentence){
            if (each.equalsIgnoreCase("Java")){
                countJava++;
            }else if (each.equalsIgnoreCase("Python")){
                countPython++;
            }
        }

        System.out.println(countJava + " Java and " + countPython + " Python");

    }

}

/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task in repl.it, but this time you MUST use arrays and for each loop)
 */