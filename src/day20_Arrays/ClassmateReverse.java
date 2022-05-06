package day20_Arrays;

public class ClassmateReverse {

    public static void main(String[] args) {

        String[] classmates = {"Mehmet Ozdogan", "Fatma Ozdogan", "Zeynep Oz", "Salim Oz", "Semra Oz",
                "Bilal Ozdogan", "Gulten Ozdogan", "Masal Ozdogan", "Oyku Ozdogan", "Ukba Karaaslanoglu" };

        for (int i = 0; i < classmates.length; i++){
            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length() - 1; j >= 0; j--){
                reverseName += name.charAt(j);
            }
            System.out.println(reverseName);
        }

    }

}

/*
2. create string array, and store the names of your  classmates (10)
reverse each student names and print them in separate lines

        ex:
            arr = {java, python, c#}

        output:
            avaJ
            nohtyp
            #c
 */