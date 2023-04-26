package Fundamentals.Exam.MidRetake;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int totalSum = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            totalSum += numbersList.get(i);
        }
        double averageNumber = totalSum * 1.0 / numbersList.size();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) > averageNumber){
                newList.add(numbersList.get(i));
            }
        }
        Collections.sort(newList);
        Collections.reverse(newList);
        if (newList.isEmpty()){
            System.out.println("No");
        }
        int count = 0;
        for (int number : newList) {
            count++;
            if (count <= 5) {
                System.out.print(number + " ");
            }
        }
    }
}
