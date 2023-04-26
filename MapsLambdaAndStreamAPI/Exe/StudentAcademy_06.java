package Fundamentals.MapsLambdaAndStreamAPI.Exe;

import java.util.*;

public class StudentAcademy_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }
        Map<String, Double> averageGradeStudent = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double averageGrades = getAverageGrade(listGrades);

            if (averageGrades >= 4.50){
                averageGradeStudent.put(studentName, averageGrades);
            }
        }
        averageGradeStudent.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
    private static double getAverageGrade(List<Double> listGrades){
        double sum = 0;
        for (double grade : listGrades) {
            sum += grade;
        }
        return sum / listGrades.size();
    }
}
