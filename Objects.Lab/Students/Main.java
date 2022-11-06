package ObjectsAndClasses.Lab.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentsList = new ArrayList<>();

        while (!input.equals("end")){
            String firstName = input.split("\\s+")[0];
            String lastName = input.split("\\s+")[1];
            String age = input.split("\\s+")[2];
            String town = input.split("\\s+")[3];

            Student student = new Student(firstName, lastName, age, town);
            studentsList.add(student);

            input = scanner.nextLine();
        }
        String inputTown = scanner.nextLine();
        for (Student student : studentsList) {
            if (student.getTown().equals(inputTown)){
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
