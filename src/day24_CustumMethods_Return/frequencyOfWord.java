package day24_CustumMethods_Return;

public class frequencyOfWord {

    public static void main(String[] args) {

        int str = frequencyOfWOrd("Java Java Java Python Python", "Java");



    }

    public static int frequencyOfWOrd(String sentence, String word){

        int count = 0;
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);
        return count;

    }

}

/*
    1.  create a method named frequencyOfWord that passes two
    parameters: string sentence and String word, then returns the frequency of word from the sentence

            Ex:
            sentence = "Java java java python python"

            word = "java";
            frequencyOfWord(sentence, word) ==>  3
 */