package Fundamentals.List.Lab;

import java.util.*;

public class ListOfProducts_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            String product = scanner.nextLine();

            productList.add(product);
        }
        Collections.sort(productList);

        for (int i = 0; i < productList.size(); i++) {
            System.out.println(i + 1 + "." + productList.get(i));
        }
    }
}
