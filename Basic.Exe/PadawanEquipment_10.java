package Fundamentals.BasicSyntax.Exe;

import java.util.Scanner;

public class PadawanEquipment_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double sabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        int freeBelt = students / 6;

        double padawanMoney = sabersPrice * (students + Math.ceil(students * 0.1)) + robesPrice * students + beltsPrice * (students - freeBelt);

        if (padawanMoney <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", padawanMoney);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", padawanMoney - money);
        }
    }
}
