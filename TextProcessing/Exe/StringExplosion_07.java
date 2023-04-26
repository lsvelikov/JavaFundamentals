package Fundamentals.TextProcessing.Exe;

import java.util.Scanner;

public class StringExplosion_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        int totalPower = 0;
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '>'){
                int explosionPower = Integer.parseInt(input.charAt(i + 1) + "");
                totalPower += explosionPower;
            } else if (totalPower > 0 && input.charAt(i) != '>'){
                input.deleteCharAt(i);
                totalPower--;
                i--;
            }

        }
        System.out.println(input);
    }
}
