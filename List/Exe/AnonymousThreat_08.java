package Fundamentals.List.Exe;

import java.util.*;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("3:1")){
            int startIndex = Integer.parseInt(input.split("\\s+")[1]);
            int endIndex = Integer.parseInt(input.split("\\s+")[2]);

            if (startIndex < 0) {
                startIndex = 0;
            }
            if (endIndex > wordsList.size() - 1) {
                endIndex = wordsList.size() - 1;
            }

            if (input.contains("merge") && isValidIndex(wordsList, startIndex) && isValidIndex(wordsList, endIndex)){
                String newList = "";
                for (int i = startIndex; i <= endIndex; i++) {
                    newList += wordsList.get(i);
                }
                for (int i = startIndex; i <= endIndex; i++) {
                    wordsList.remove(startIndex);
                }
                wordsList.add(startIndex, newList);
            }else if (input.contains("divide")){
                int index = Integer.parseInt(input.split("\\s+")[1]);
                int partitions = Integer.parseInt(input.split("\\s+")[2]);
                String stringToDivide = wordsList.get(index);
                wordsList.remove(index);
                int dividedStrings = stringToDivide.length() / partitions;

                int startText = 0;
                for (int i = 1; i < partitions; i++) {
                    wordsList.add(index, stringToDivide.substring(startText, startText + dividedStrings));
                    index++;
                    startText += dividedStrings;
                }
                wordsList.add(index, stringToDivide.substring(startText));
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", wordsList));
    }
    public static boolean isValidIndex(List<String> list, int index){
        return index >= 0 && index <= list.size() - 1;
    }
}
