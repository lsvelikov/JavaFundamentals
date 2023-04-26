package Fundamentals.Exam.FinalRetake.FinalExamRetake_01;

import java.util.Scanner;

public class TheImitationGame_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder decryptedMessage = new StringBuilder(encryptedMessage);
        while (!command.equals("Decode")){
            String[] dataParts = command.split("\\|");

            switch (dataParts[0]){
                case "Move":
                    int moves = Integer.parseInt(dataParts[1]);
                    String lettersToMove = decryptedMessage.substring(0, moves);
                    decryptedMessage.append(lettersToMove);
                    decryptedMessage.delete(0, moves);
                    break;
                case "Insert":
                    int index = Integer.parseInt(dataParts[1]);
                    String value = dataParts[2];
                    decryptedMessage.insert(index, value);
                    break;
                case "ChangeAll":
                    String substring = dataParts[1];
                    String replacement = dataParts[2];
                    for (char symbol : decryptedMessage.toString().toCharArray()) {
                        String currentSymbol = String.valueOf(symbol);
                        if (currentSymbol.equals(substring)) {
                            int indexCurrentSymbol = Integer.parseInt(String.valueOf(decryptedMessage.indexOf(currentSymbol)));
                            decryptedMessage.delete(indexCurrentSymbol, indexCurrentSymbol + 1);
                            decryptedMessage.replace(indexCurrentSymbol, indexCurrentSymbol, replacement);
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + decryptedMessage);
    }
}
