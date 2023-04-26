package Fundamentals.MapsLambdaAndStreamAPI.Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordSynonyms_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }
        words.entrySet().forEach(entry -> System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue())));
    }
}
