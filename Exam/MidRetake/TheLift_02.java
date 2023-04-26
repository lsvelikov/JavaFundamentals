package Fundamentals.Exam.MidRetake;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int people = n;
        int [] wagonsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxWagonCapacity = 4;
        for (int i = 0; i < wagonsArray.length; i++) {
            int currentWagonCapacity = wagonsArray[i];
            int peopleToLoad = maxWagonCapacity - currentWagonCapacity;
            if (currentWagonCapacity < maxWagonCapacity){
                if (peopleToLoad > people){
                    wagonsArray[i] = currentWagonCapacity + people;
                    people -= people;
                }else {
                    wagonsArray[i] = currentWagonCapacity + peopleToLoad;
                    people -= peopleToLoad;
                }
            }
        }
        if (people == 0 && (wagonsArray.length * 4) - n > 0){
            System.out.println("The lift has empty spots!");
        }else if (people > 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        }
        for (int j : wagonsArray) {
            System.out.print(" " + j);
        }
    }
}
