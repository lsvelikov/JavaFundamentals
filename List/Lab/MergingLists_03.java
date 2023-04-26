package Fundamentals.List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int smallestList = Math.min(firstList.size(), secondList.size());

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < smallestList; i++) {
            int elementFirstList = firstList.get(i);
            int elementSecondList = secondList.get(i);
            resultList.add(elementFirstList);
            resultList.add(elementSecondList);
        }
        if (firstList.size() > secondList.size()){
            resultList.addAll(firstList.subList(smallestList, firstList.size()));
        }else if(secondList.size() > firstList.size()) {
            resultList.addAll(secondList.subList(smallestList, secondList.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
//        for (int element : resultList) {
//            System.out.print(element + " ");
//        }
    }
}
