package Fundamentals.Exam.FinalRetake.FinalExamRetake_01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> composerMap = new LinkedHashMap<>();
        Map<String, String> keyMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("\\|");
            String piece = data[0];
            String composer = data[1];
            String key = data[2];

            composerMap.putIfAbsent(piece, composer);
            keyMap.putIfAbsent(piece, key);

        }
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] parts = command.split("\\|");
            String piece = parts[1];

            if (command.contains("Add")) {
                String composer = parts[2];
                String key = parts[3];

                if (composerMap.containsKey(piece)) {
                    System.out.printf("%s is already in the collection!%n", piece);
                } else {
                    composerMap.put(piece, composer);
                    keyMap.put(piece, key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }
            } else if (command.contains("Remove")) {
                if (composerMap.containsKey(piece)) {
                    composerMap.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            } else if (command.contains("ChangeKey")) {
                String newKey = parts[2];
                if (keyMap.containsKey(piece)) {
                    keyMap.put(piece, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : composerMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue(), keyMap.get(entry.getKey()));
        }
    }
}
