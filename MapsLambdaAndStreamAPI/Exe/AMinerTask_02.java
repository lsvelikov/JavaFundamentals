package Fundamentals.MapsLambdaAndStreamAPI.Exe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> result = new LinkedHashMap<>();
        while (!input.equals("stop")){
            String recourses = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            result.putIfAbsent(recourses, 0);
            result.put(recourses, result.get(recourses) + quantity);

            input = scanner.nextLine();
        }
        result.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));
    }
}
