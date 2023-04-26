package Fundamentals.TextProcessing.Exe;

import java.util.Scanner;

public class CharacterMultiplier_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] wordsArray = input.split("\\s+");
        String firstWord = wordsArray[0];
        String secondWord = wordsArray[1];

        int totalSum = 0;
        if (firstWord.length() >= secondWord.length()) {
            int length2 = secondWord.length();
            for (int i = 0; i < firstWord.length(); i++) {
                int symbol1 = firstWord.charAt(i);
                if(length2 > 0) {
                    int symbol2 = secondWord.charAt(i);
                    totalSum += symbol1 * symbol2;
                    length2--;
                }else{
                    totalSum += symbol1;
                }
            }
        } else {
            int length1 = firstWord.length();
            for (int i = 0; i < secondWord.length(); i++) {
                int symbol2 = secondWord.charAt(i);
                if (length1 > 0){
                    int symbol1 = firstWord.charAt(i);
                    totalSum += symbol2 * symbol1;
                    length1--;
                }else{
                    totalSum += symbol2;
                }
            }
        }
        System.out.println(totalSum);
    }
}
