package Fundamentals.MapsLambdaAndStreamAPI.Exe;

import java.util.*;

public class CompanyUsers_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> companyMap = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String company = input.split("\\s+->\\s+")[0];
            String id = input.split("\\s+->\\s+")[1];

            companyMap.putIfAbsent(company, new ArrayList<>());
            if (!companyMap.get(company).contains(id)) {
                companyMap.get(company).add(id);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companyMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (String id : entry.getValue()) {
                System.out.printf("-- %s%n", id);
            }
        }
    }
}
