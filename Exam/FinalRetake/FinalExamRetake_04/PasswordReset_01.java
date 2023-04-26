package Fundamentals.Exam.FinalRetake.FinalExamRetake_04;

import java.util.Scanner;

public class PasswordReset_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();

        StringBuilder newText = new StringBuilder();

        while (!input.equals("Done")){
            String[] command = input.split("\\s+");

            if (input.contains("TakeOdd")){
                for (int i = 0; i < text.length(); i++) {
                    if (i % 2 != 0){
                        newText.append(text.charAt(i));
                    }
                }
                text = newText.toString();
                System.out.println(text);
            }else if (input.contains("Cut")){
                int index = Integer.parseInt(command[1]);
                int length = Integer.parseInt(command[2]);

                String substringToRemove = text.substring(index, index + length);
                text = text.replaceFirst(substringToRemove, "");

                System.out.println(text);
            }else if (input.contains("Substitute")){
                String substring = command[1];
                String substitute = command[2];
                if (text.contains(substring)) {
                    text = text.replaceAll(substring, substitute);
                    System.out.println(text);
                }else{
                    System.out.println("Nothing to replace!");
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + text);
    }
}
