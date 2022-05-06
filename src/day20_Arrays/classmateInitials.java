package day20_Arrays;

public class classmateInitials {

    public static void main(String[] args) {

        String[] classmates = {"Mehmet Ozdogan", "Fatma Ozdogan", "Zeynep Oz", "Salim Oz", "Semra Oz",
                "Bilal Ozdogan", "Gulten Ozdogan", "Masal Ozdogan", "Oyku Ozdogan", "Ukba Karaaslanoglu" };

        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) + "." + classmates[i].charAt( classmates[i].indexOf(" ") + 1);
            System.out.println(initial);

        }


    }

}
/*
create an array named classmates, and store 10 of your classmates' full names

print the initials of each classmates in separate lines
 */