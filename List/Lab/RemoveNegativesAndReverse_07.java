package Fundamentals.List.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

//        for (int i = 0; i < numbersList.size(); i++) {
//            int number = numbersList.get(i);
//            if (number < 0){
//                numbersList.remove(i);
//                i--;
//            }
//            if (numbersList.size() == 0){
//                System.out.println("empty");
//                break;
//            }
//        }
        numbersList.removeIf(e -> e < 0);

        Collections.reverse(numbersList);

        if (numbersList.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
