package ObjectsAndClasses.Lab.Students2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentsList = new ArrayList<>();

        while (!input.equals("end")) {
            String firstName = input.split("\\s+")[0];
            String lastName = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);
            String town = input.split("\\s+")[3];

            Student student = new Student(firstName, lastName, age, town);

            int existingIndex = findStudentIndex(studentsList, student.getFirstName(), student.getLastName());
            if (existingIndex != -1) {
                studentsList.get(existingIndex).setAge(student.getAge());
                studentsList.get(existingIndex).setTown(student.getTown());
            } else {
                studentsList.add(student);
            }

            input = scanner.nextLine();
        }
        String inputTown = scanner.nextLine();
        for (Student student : studentsList) {
            if (student.getTown().equals(inputTown)){
                System.out.print(student);
            }
        }
    }

    public static int findStudentIndex(List<Student> studentList, String firstName, String lastName) {
        for (int i = 0; i < studentList.size(); i++) {
            String firstNameList = studentList.get(i).getFirstName();
            String lastNameList = studentList.get(i).getLastName();

            if (firstNameList.equals(firstName) && lastNameList.equals(lastName)) {
                return i;
            }
        }
        return -1;
    }
}
