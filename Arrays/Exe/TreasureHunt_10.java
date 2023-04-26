package Fundamentals.Arrays.Exe;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunt_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] loot = scanner.nextLine().split("\\|");
        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")){
            String[] command = input.split(" ");

            switch (command[0]){
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        boolean alreadyContained = false;
                        for (int j = 0; j < loot.length; j++) {
                            if (command[i].equals(loot[j])){
                                alreadyContained = true;
                                break;
                            }
                        }
                        if (!alreadyContained){
                            String newLoot = command[i] + " " + String.join(" ", loot);
                            loot = newLoot.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(command[1]);
                     if (position <= loot.length - 1 && position >= 0){
                         String dropItem = loot[position];
                         for (int i = position; i < loot.length - 1; i++) {
                             loot[i] = loot[i + 1];
                         }
                         loot[loot.length - 1] = dropItem;
                     }else{
                         break;
                     }
                    break;
                case "Steal":
                    int numbersOfStealItems = Integer.parseInt(command[1]);

                    if (numbersOfStealItems >= 0 && numbersOfStealItems < loot.length){
                        for (int i = 0; i < numbersOfStealItems; i++) {
                            System.out.print(loot[loot.length - numbersOfStealItems + i]);
                            if (i != numbersOfStealItems - 1){
                                System.out.print(", ");
                            }
                        }
                        String[] tempLoot = new String[loot.length - numbersOfStealItems];
                        for (int i = 0; i < tempLoot.length; i++) {
                            tempLoot[i] = loot[i];
                        }
                        loot = tempLoot;
                    }else if (numbersOfStealItems >= 0){
                        for (int i = 0; i < loot.length; i++) {
                            System.out.print(loot[i]);
                            if (i != loot.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        loot = new String[0];
                    }
                    System.out.println();
                    break;
            }


            input = scanner.nextLine();
        }
        String treasureCount = String.join("", loot);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
        double averageTreasure = (1.0 * charCounter) / loot.length;
        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
