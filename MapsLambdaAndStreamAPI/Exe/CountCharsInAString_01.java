package Fundamentals.MapsLambdaAndStreamAPI.Exe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine().replaceAll("\\s+", "");

        Map<Character, Integer> words = new LinkedHashMap<>();
        for (char symbol : data.toCharArray()) {
            words.putIfAbsent(symbol, 0);
            words.put(symbol, words.get(symbol) + 1);
        }
        words.entrySet().forEach(entry -> System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue()));
    }
}
