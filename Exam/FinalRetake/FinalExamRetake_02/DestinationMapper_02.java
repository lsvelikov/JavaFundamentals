package Fundamentals.Exam.FinalRetake.FinalExamRetake_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(\\=|\\/)(?<destination>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinationList = new ArrayList<>();
        int totalPoints = 0;
        while (matcher.find()){
            String destination = matcher.group("destination");
            totalPoints += destination.length();
            destinationList.add(destination);
        }

        System.out.println("Destinations: " + String.join(", ", destinationList));
        System.out.printf("Travel Points: %d%n", totalPoints);
    }
}
