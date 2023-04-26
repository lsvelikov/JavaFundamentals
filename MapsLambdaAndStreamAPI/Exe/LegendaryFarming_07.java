package Fundamentals.MapsLambdaAndStreamAPI.Exe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> keyItems = new LinkedHashMap<>();
        keyItems.put("shards", 0);
        keyItems.put("fragments", 0);
        keyItems.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();

        boolean isWinner = false;
        while (!isWinner) {
            String input = scanner.nextLine();
            String[] data = input.split("\\s+");

            for (int i = 0; i < data.length; i += 2) {
                int quantityAsInt = Integer.parseInt(data[i]);
                String material = data[i + 1].toLowerCase();

                boolean isKeyMaterial = material.equals("shards") || material.equals("fragments") || material.equals("motes");
                if (isKeyMaterial) {
                    keyItems.put(material, keyItems.get(material) + quantityAsInt);
                } else {
                    if (!junkItems.containsKey(material)) {
                        junkItems.put(material, quantityAsInt);
                    } else {
                        junkItems.put(material, junkItems.get(material) + quantityAsInt);
                    }
                }
                if (keyItems.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    keyItems.put("shards", keyItems.get("shards") - 250);
                    isWinner = true;
                    break;
                } else if (keyItems.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    keyItems.put("fragments", keyItems.get("fragments") - 250);
                    isWinner = true;
                    break;
                } else if (keyItems.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    keyItems.put("motes", keyItems.get("motes") - 250);
                    isWinner = true;
                    break;
                }
            }
            if (isWinner) {
                break;
            }
        }
        keyItems.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junkItems.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
