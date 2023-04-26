package Fundamentals.MapsLambdaAndStreamAPI.Exe;

import java.util.*;

public class Courses_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> course = new LinkedHashMap<>();
        while (!input.equals("end")){
            String courseName = input.split("\\s+:\\s+")[0];
            String studentName = input.split("\\s+:\\s+")[1];

            course.putIfAbsent(courseName, new ArrayList<>());
            course.get(courseName).add(studentName);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : course.entrySet()) {
            int length = entry.getValue().size();
            System.out.printf("%s: %s%n", entry.getKey(), length);
            for (String student : entry.getValue()) {
                System.out.printf("-- %s%n", student);
            }
        }
    }
}
