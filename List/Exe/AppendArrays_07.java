package Fundamentals.List.Exe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> numbersList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        List<String> arrayList = new ArrayList<>();

        for (int i = numbersList.size() - 1; i >= 0 ; i--) {
            arrayList.add(numbersList.get(i));
        }

        for (String number : arrayList) {
            System.out.print(number.replaceAll("\\s+", " ").trim() + " ");
        }

//        System.out.println(arrayList.toString().replaceAll("[\\[\\],]", "").replaceAll("\\s+", " ").trim());
    }
}
