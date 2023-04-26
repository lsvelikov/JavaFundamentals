package Fundamentals.Exam.MidRetake;

import java.util.Scanner;

public class CounterStrike_0001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int countWins = 0;
        boolean isNotEnough = false;
        while (!command.equals("End of battle")){
            int currentEnergy = Integer.parseInt(command);

            if (currentEnergy > energy){
                isNotEnough = true;
                break;
            }
            energy -= currentEnergy;
            countWins++;
            if (countWins % 3 == 0){
                energy += countWins;
            }
            if (energy == 0){
                break;
            }


            command = scanner.nextLine();
        }
        if (isNotEnough){
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", countWins, energy);
        }else if (energy == 0){
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", countWins, energy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d", countWins, energy);
        }
    }
}
