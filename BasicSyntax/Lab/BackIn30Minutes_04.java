package Fundamentals.BasicSyntax.Lab;

import java.util.Scanner;

public class BackIn30Minutes_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalTimeInMinutes = hours * 60 + minutes;
        int requiredTimeInMinutes = totalTimeInMinutes + 30;

        int requiredHour = requiredTimeInMinutes / 60;
        int requiredMinutes = requiredTimeInMinutes % 60;

        if (requiredHour > 23){
            requiredHour = 0;
        }

        System.out.printf("%d:%02d", requiredHour, requiredMinutes);
    }
}
