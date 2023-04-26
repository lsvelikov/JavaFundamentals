package Fundamentals.Exam.MidRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> elementsList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();

        int moves = 0;
        while (!input.equals("end")) {
            String[] indexes = input.split("\\s+");
            int index1 = Integer.parseInt(indexes[0]);
            int index2 = Integer.parseInt(indexes[1]);
            if (elementsList.size() == 0) {
                System.out.printf("You have won in %d turns!%n", moves);
                break;
            }
            moves++;
            if (index1 == index2 || index1 < 0 || index2 < 0 || index1 > elementsList.size() - 1 || index2 > elementsList.size() - 1) {
                System.out.println("Invalid input! Adding additional elements to the board");
                int indexToAdd1 = elementsList.size() / 2;
                int indexToAdd2 = indexToAdd1 + 1;
                String stringToAdd = String.format("-%da", moves);
                elementsList.add(indexToAdd1, stringToAdd);
                elementsList.add(indexToAdd2, stringToAdd);
                input = scanner.nextLine();
                continue;
            }
            String element1 = elementsList.get(index1);
            String element2 = elementsList.get(index2);
            if (element1.equals(element2)) {
                elementsList.remove(index1);
                if (index1 < index2) {
                    elementsList.remove(index2 - 1);
                } else {
                    elementsList.remove(index2);
                }
                System.out.printf("Congrats! You have found matching elements - %s!%n", element1);
            } else {
                System.out.println("Try again!");
            }

            input = scanner.nextLine();
        }
        if (elementsList.size() > 0) {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", elementsList));
        }
    }
}
