package Fundamentals.Exam.FinalRetake.FinalExamRetake_02;

import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> plantsRarityMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] plantsInfoArr = input.split("<->");
            String plantName = plantsInfoArr[0];
            int plantRarity = Integer.parseInt(plantsInfoArr[1]);
            plantsRarityMap.put(plantName, plantRarity);
        }
        LinkedHashMap<String, ArrayList<Integer>> plantsRatingMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String regex = "[: -]+";
            String command = input.split(regex)[0];

            String name = input.split(regex)[1];
            if (!plantsRarityMap.containsKey(name)) {
                System.out.println("error");
            } else {
                if (command.equals("Rate")) {
                    int rating = Integer.parseInt(input.split(regex)[2]);
                    plantsRatingMap.putIfAbsent(name, new ArrayList<>());
                    plantsRatingMap.get(name).add(rating);
                } else if (command.equals("Update")) {
                    int newRarity = Integer.parseInt(input.split(regex)[2]);
                    plantsRarityMap.replace(name, newRarity);
                } else if (command.equals("Reset")) {
                    plantsRatingMap.get(name).clear();
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        double averRate;
        for (Map.Entry<String, Integer> entry : plantsRarityMap.entrySet()) {
            String name = entry.getKey();
            int rarity = entry.getValue();
            if (plantsRatingMap.get(name).size() > 0) {
                averRate = plantsRatingMap.get(name).stream().mapToInt(Integer::intValue).average().getAsDouble();
            } else {
                averRate = 0.0;
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", name, rarity, averRate);
        }

    }
}
