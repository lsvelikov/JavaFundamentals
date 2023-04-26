package Fundamentals.MapsLambdaAndStreamAPI.Exe;

import java.util.*;

public class SoftUniExamResults_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> studentsMap = new LinkedHashMap<>();
        Map<String, Integer> courseMap = new LinkedHashMap<>();
        while (!input.equals("exam finished")) {
            String studentName = input.split("-")[0];

            if (input.split("-").length > 2){
                String course = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);

                if (!studentsMap.containsKey(studentName)){
                    studentsMap.put(studentName, points);
                }else{
                    int currentPoints = studentsMap.get(studentName);
                    if (points > currentPoints){
                        studentsMap.put(studentName, points);
                    }
                }
                courseMap.putIfAbsent(course, 0);
                courseMap.put(course, courseMap.get(course) + 1);
            }else{
                studentsMap.remove(studentName);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        studentsMap.entrySet().forEach(entry -> System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));
        System.out.println("Submissions:");
        courseMap.entrySet().forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));
    }
}
