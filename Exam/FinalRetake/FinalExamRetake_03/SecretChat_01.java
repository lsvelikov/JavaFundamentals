package Fundamentals.Exam.FinalRetake.FinalExamRetake_03;

import java.util.Scanner;

public class SecretChat_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);

        String command = scanner.nextLine();

        int count = 0;
        StringBuilder reversed = new StringBuilder();
        while (!command.equals("Reveal")) {
            String[] data = command.split(":\\|:");
            String toDo = data[0];

            switch (toDo) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    text.insert(index, " ");
                    System.out.println(text);
                    break;
                case "Reverse":
                    String reverseSubstring = data[1];
                    int indexToRemove = text.indexOf(reverseSubstring);
                    if (!text.toString().contains(reverseSubstring)) {
                        System.out.println("error");
                    } else if (count >= 1) {
//                        text.replace(indexToRemove, reverseSubstring.length() + indexToRemove, "");
                        break;
                    } else {
                        for (int i = reverseSubstring.length() - 1; i >= 0; i--) {
                            char currentSymbol = reverseSubstring.charAt(i);
                            reversed.append(currentSymbol);
                        }
                        count++;
                        text.replace(indexToRemove, reverseSubstring.length() + indexToRemove, "");
                        text.append(reversed);
                        System.out.println(text);

                    }
                    break;
                case "ChangeAll":
                    String substring = data[1];
                    String replacement = data[2];
                    while (text.toString().contains(substring)) {
                        int indexToChange = text.indexOf(substring);
                        text.replace(indexToChange, indexToChange + 1, replacement);
                    }
                    System.out.println(text);
                    break;

            }

            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + text);
    }
}
