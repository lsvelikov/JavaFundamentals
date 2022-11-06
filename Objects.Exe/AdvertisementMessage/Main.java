package ObjectsAndClasses.Exe.AdvertisementMessage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AdvertisementMessage message = new AdvertisementMessage();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println(message.randomMessage());
        }
    }
}
