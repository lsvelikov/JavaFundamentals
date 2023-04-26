package Fundamentals.List.Exe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> namesList = new ArrayList<>();
        for (int i = 0; i < numberOfCommands; i++) {
            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];

            if (input.contains("not")){
                if (namesList.contains(name)){
                    namesList.remove(name);
                }
                else{
                    System.out.printf("%s is not in the list!%n", name);
                }
            }else{
                if (namesList.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else{
                    namesList.add(name);
                }
            }
        }
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}

