package Fundamentals.MapsLambdaAndStreamAPI.Lab;

import java.util.*;

public class OddOccurrences_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String word : words) {
            word = word.toLowerCase();

            wordsMap.putIfAbsent(word, 0);
            wordsMap.put(word, wordsMap.get(word) + 1);
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0){
                resultList.add(entry.getKey());
            }
        }
            System.out.print(String.join(", ", resultList));
    }
}
