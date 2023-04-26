package Fundamentals.MapsLambdaAndStreamAPI.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        TreeMap<Integer, Integer> count = new TreeMap<>();

        for (int num : numbers) {
            if (!count.containsKey(num)){
                count.put(num, 0);
            }
            count.put(num, count.get(num) + 1);
        }
        count.entrySet().forEach(entry -> System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue()));
    }
}
