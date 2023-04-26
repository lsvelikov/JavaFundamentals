package Fundamentals.Exam.FinalRetake.FinalExam;

import java.util.*;

public class WildZoo_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> foodMap = new LinkedHashMap<>();
        Map<String, String> areaMap = new LinkedHashMap<>();
        Map<String, Integer> mapToPrint = new LinkedHashMap<>();
        while (!input.equals("EndDay")) {
            String[] data = input.split("[:\\-]");
            String command = data[0];
            String animalName = data[1];

            switch (command) {
                case "Add":
                    int neededFood = Integer.parseInt(data[2]);
                    String area = data[3];
                    if (!foodMap.containsKey(animalName)) {
                        foodMap.put(animalName, neededFood);
                    } else {
                        foodMap.put(animalName, foodMap.get(animalName) + neededFood);
                    }
                    areaMap.put(animalName, area);
                    break;
                case "Feed":
                    int food = Integer.parseInt(data[2]);
                    if (foodMap.containsKey(animalName)) {
                        foodMap.put(animalName, foodMap.get(animalName) - food);
                        if (foodMap.get(animalName) <= 0) {
                            foodMap.remove(animalName);
                            areaMap.remove(animalName);
                            System.out.println(animalName.trim() + " was successfully fed");
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("Animals:");
        foodMap.entrySet().forEach(entry -> System.out.printf("%s -> %dg%n", entry.getKey(), entry.getValue()));
        System.out.println("Areas with hungry OOP.Inheritance.animals:");
        for (Map.Entry<String, String> entry : areaMap.entrySet()) {
            String areaToAdd = areaMap.get(entry.getKey());
            if (!mapToPrint.containsKey(areaToAdd)){
                mapToPrint.put(areaToAdd, 1);
            }else{
                mapToPrint.put(areaToAdd, mapToPrint.get(areaToAdd) + 1);
            }
        }
        mapToPrint.entrySet().forEach(entry -> System.out.printf(" %s: %d%n", entry.getKey(),entry.getValue()));
    }
}

