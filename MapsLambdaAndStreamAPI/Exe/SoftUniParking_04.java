package Fundamentals.MapsLambdaAndStreamAPI.Exe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> userData = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s+")[0];
            String userName = input.split("\\s+")[1];

            if (command.equals("register")) {
                String plateNumber = input.split("\\s+")[2];
                if (!userData.containsKey(userName)){
                    userData.put(userName, plateNumber);
                    System.out.printf("%s registered %s successfully%n", userName, plateNumber);
                }else{
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }
            } else if (command.equals("unregister")) {
                if (!userData.containsKey(userName)){
                    System.out.printf("ERROR: user %s not found%n", userName);
                }else{
                    userData.remove(userName);
                    System.out.printf("%s unregistered successfully%n", userName);
                }
            }
        }
        userData.entrySet().forEach(entry -> System.out.printf("%s => %s%n", entry.getKey(), entry.getValue()));
    }
}
