package ObjectsAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] wordsArray = input.split(" ");

        Random randomGenerator = new Random();

        for (int i = 0; i < wordsArray.length; i++) {
            int index1 = randomGenerator.nextInt(wordsArray.length);
            int index2 = randomGenerator.nextInt(wordsArray.length);

            String oldWord = wordsArray[index1];
            wordsArray[index1] = wordsArray[index2];
            wordsArray[index2] = oldWord;

        }
        System.out.println(String.join(System.lineSeparator(), wordsArray));
    }
}
