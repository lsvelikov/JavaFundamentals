package Fundamentals.Exam.MidRetake;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] data = command.split("\\s+");

            switch (data[0]){
                case "swap":
                    int index1 = Integer.parseInt(data[1]);
                    int index2 = Integer.parseInt(data[2]);

                    int indexToSwap1 = numbers[index1];
                    int indexToSwap2 = numbers[index2];

                    numbers[index1] = indexToSwap2;
                    numbers[index2] = indexToSwap1;

                    break;
                case "multiply":
                    int indexToMultiply1 = Integer.parseInt(data[1]);
                    int indexToMultiply2 = Integer.parseInt(data[2]);

                    int result = numbers[indexToMultiply1] * numbers[indexToMultiply2];

                    numbers[indexToMultiply1] = result;

                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i]--;
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1){
                System.out.print(numbers[i]);
            }else{
                System.out.print(numbers[i] + ", ");
            }
        }
    }
}
