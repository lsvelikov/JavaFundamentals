package Fundamentals.List.Exe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            if (command[0].equals("Add")) {
                int passengers = Integer.parseInt(command[1]);
                wagonsList.add(passengers);
            } else {
                for (int i = 0; i < wagonsList.size(); i++) {
                    int passengers = wagonsList.get(i);
                    int passengersToAdd = Integer.parseInt(command[0]);
                    if (passengers + passengersToAdd <= maxCapacity){
                        wagonsList.set(i, passengers + passengersToAdd);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int wagon : wagonsList) {
            System.out.print(wagon + " ");
        }
    }
}
