package Fundamentals.MapsLambdaAndStreamAPI.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = Arrays.stream(scanner.nextLine().split("\\s+")).filter(word -> word.length() % 2 == 0).toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(), wordsArray));
    }
}
