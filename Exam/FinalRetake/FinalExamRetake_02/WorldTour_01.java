package Fundamentals.Exam.FinalRetake.FinalExamRetake_02;

import java.util.Scanner;

public class WorldTour_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder destination = new StringBuilder(input);
        while (!command.equals("Travel")){
            String[] data = command.split(":");

            if (command.contains("Add Stop")){
                int index = Integer.parseInt(data[1]);
                String substring = data[2];
                if (index >= 0 && index <= destination.length() - 1) {
                    destination.insert(index, substring);
                }
                System.out.printf("%s%n", destination);
            }else if (command.contains("Remove Stop")){
                int startIndex = Integer.parseInt(data[1]);
                int endIndex = Integer.parseInt(data[2]);
                if (startIndex >= 0 && startIndex <= destination.length() - 1 && endIndex >= 0 && endIndex <= destination.length() - 1){
                    destination.delete(startIndex, endIndex + 1);
                }
                System.out.printf("%s%n", destination);
            }else if (command.contains("Switch")){
                String oldString = data[1];
                String newString = data[2];
                int startIndex = destination.indexOf(oldString);
                if (destination.toString().contains(oldString)){
                    destination.delete(startIndex, startIndex + oldString.length());
                    destination.insert(startIndex, newString);
                }
                System.out.printf("%s%n", destination);
            }


            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", destination);
    }
}
