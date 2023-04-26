package Fundamentals.Exam.MidRetake;

import java.util.Scanner;

public class SoftUniReception_001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int employerEfficiency1 = Integer.parseInt(scanner.nextLine());
        int employerEfficiency2 = Integer.parseInt(scanner.nextLine());
        int employerEfficiency3 = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        
        int totalEfficiencyInHour = employerEfficiency1 + employerEfficiency2 + employerEfficiency3;

        int hours = 0;
        while (students > 0){
            hours++;
            if (!(hours % 4 == 0)){
                students -= totalEfficiencyInHour;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
