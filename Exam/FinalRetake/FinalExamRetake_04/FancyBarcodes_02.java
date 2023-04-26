package Fundamentals.Exam.FinalRetake.FinalExamRetake_04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            matcher = pattern.matcher(input);

            if (matcher.find()){

                StringBuilder barcode = new StringBuilder();
                for (int j = 0; j < input.length(); j++) {
                    if (Character.isDigit(input.charAt(j))){
                        barcode.append(input.charAt(j));
                    }
                }
                if (barcode.length() == 0) {
                    System.out.println("Product group: 00");
                }else{
                    System.out.println("Product group: " + barcode.toString());
                }
            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
