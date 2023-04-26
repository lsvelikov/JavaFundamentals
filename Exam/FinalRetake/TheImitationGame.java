package Fundamentals.Exam.FinalRetake;

import java.util.*;
import java.util.stream.Collectors;

public class TheImitationGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        String input = scanner.nextLine();
        List<String> message = Arrays.stream(encryptedMessage.split("")).collect(Collectors.toList());

        while (!input.equals("Decode")) {
            if (message.size() > 0) {
                String[] command = input.split("\\|");
                String action = command[0];
                switch (action) {
                    case "Move":
                        int nLetters = Integer.parseInt(command[1]);
                        for (int i = 0; i < message.size(); i++) {
                            String currentLetter = message.get(i);
                            message.add(currentLetter);
                            if (i == nLetters - 1) {
                                break;
                            }
                        }
                        int count = 0;
                        for (int i = 0; i < nLetters; i++) {
                            message.remove(i);
                            count++;
                            if (count == nLetters) {
                                break;
                            }
                            i = -1;
                        }
                        break;
                    case "Insert":
                        int index = Integer.parseInt(command[1]);
                        if (index > 0 && index <= message.size() - 1) {
                            String value = command[2];
                            message.add(index, value);
                        } else if (index > message.size() - 1) {
                            String value = command[2];
                            message.add(value);
                        } else if (index <= 0) {
                            String value = command[2];
                            message.add(0, value);
                        }
//                        int index = Integer.parseInt(input.split("\\|")[1]);
//                        String value = input.split("\\|")[2];
//                        String newString = "";
//                        for (int i = 0; i < value.length(); i++) {
//                            char symbol = value.charAt(i);
//                            newString += symbol + " ";
//                        }
//                        List<String> newList = Arrays.asList(newString.split(" "));
//                        for (int i = 0; i < newList.size(); i++) {
//                            message.add(index, newList.get(i));
//                            index++;
//                        }
                        break;
                    case "ChangeAll":
                        String substring = command[1];
                        String replacement = command[2];
                        for (int i = 0; i <= message.size() - 1; i++) {
                            String currentLetter = message.get(i);
                            if (currentLetter.equals(substring)) {
                                message.set(i, replacement);
                            }
                        }
                        break;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", String.join("", message));
    }
}
