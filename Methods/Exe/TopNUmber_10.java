package Fundamentals.Methods.Exe;

import java.util.Scanner;

public class TopNUmber_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= inputNumber; i++){
            if (isContainingOneOddDigit(i) && isSumOfDigitsDivisibleBy8(i)) {
                System.out.println(i);
            }
        }


    }
    public static boolean isSumOfDigitsDivisibleBy8(int number){

        int sumOfDigits = 0;
        while (number > 0){
            int lastDigit = number % 10;
            sumOfDigits += lastDigit;
            number /= 10;
        }
        return sumOfDigits % 8 == 0;
    }
    public static boolean isContainingOneOddDigit(int number){

        while (number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0){
                return true;
            }else{
                number /= 10;
            }
        }
        return false;
    }
}
