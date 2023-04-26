package Fundamentals.RegEx.Exe;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String namesParticipants = scanner.nextLine();
        List<String> participants = Arrays.stream(namesParticipants.split(", ")).collect(Collectors.toList());

        Map<String, Integer> racerDistance = new LinkedHashMap<>();
        participants.forEach(participant -> racerDistance.put(participant, 0));

        String letterRegex = "[A-Za-z]+";
        Pattern letterPattern = Pattern.compile(letterRegex);

        String digitRegex = "[0-9]";
        Pattern digitPattern = Pattern.compile(digitRegex);

        String input = scanner.nextLine();
        while (!input.equals("end of race")){

            StringBuilder racerName = new StringBuilder();
            Matcher letterMatcher = letterPattern.matcher(input);

            while (letterMatcher.find()){
                racerName.append(letterMatcher.group());
            }

            int distance = 0;
            Matcher digitMatcher = digitPattern.matcher(input);

            while (digitMatcher.find()){
                distance += Integer.parseInt(digitMatcher.group());
            }

            if (participants.contains(racerName.toString())){
                int currentDistance = racerDistance.get(racerName.toString());
                racerDistance.put(racerName.toString(), currentDistance + distance);
            }

            input = scanner.nextLine();
        }
        List<String> top3Names = racerDistance.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());
        System.out.println("1st place: " + top3Names.get(0));
        System.out.println("2nd place: " + top3Names.get(1));
        System.out.println("3rd place: " + top3Names.get(2));
    }
}
