package Fundamentals.DataTypes.MoreExe;

import java.util.Scanner;

public class DecryptingMessage_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfLines; i++) {
            char letter = scanner.nextLine().charAt(0);
            char newChar = (char) (letter + key);
            System.out.print(newChar);
        }
    }
}
