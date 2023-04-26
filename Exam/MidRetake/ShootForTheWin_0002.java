package Fundamentals.Exam.MidRetake;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_0002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] targetsArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        int count = 0;
        while (!command.equals("End")){
            int currentIndex = Integer.parseInt(command);

            if (currentIndex >= 0 && currentIndex <= targetsArray.length - 1){
                int currentValue = targetsArray[currentIndex];
                targetsArray[currentIndex] = -1;
                count++;
                for (int i = 0; i < targetsArray.length; i++) {
                    int value = targetsArray[i];
                    if (value == -1){
                        continue;
                    }else{
                        if (value > currentValue){
                            value -= currentValue;
                            targetsArray[i] = value;
                        }else{
                            value += currentValue;
                            targetsArray[i] = value;
                        }
                    }
                }
            }


            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        for (int number : targetsArray) {
            System.out.print(number + " ");
        }
    }
}
