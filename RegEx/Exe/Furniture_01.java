package Fundamentals.RegEx.Exe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        List<String> productList = new ArrayList<>();
        double totalPrice = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String typeFurniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                productList.add(typeFurniture);
                totalPrice += price * quantity;

            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String item : productList) {
            System.out.println(item);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
