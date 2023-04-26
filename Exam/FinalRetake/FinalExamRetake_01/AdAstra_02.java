package Fundamentals.Exam.FinalRetake.FinalExamRetake_01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(#|\\|)(?<item>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1");
        Matcher matcher = pattern.matcher(input);

        StringBuilder sb = new StringBuilder();

        int totalCalories = 0;
        while (matcher.find()){
            String item = matcher.group("item");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;

            sb.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", item, date, calories));
        }
        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);
        System.out.println(sb);
    }
}
