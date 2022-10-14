package Fundamentals.Methods.Exe;

import java.util.Scanner;

public class CharactersInRange_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printChar(symbol1, symbol2);

    }
    public static void printChar(char symbol1, char symbol2){
        if (symbol1 < symbol2){
            for (int i = (char) (symbol1 + 1); i < symbol2; i++) {
                System.out.print((char) i + " ");
            }
        }else{
            for (int i = (char) (symbol2 + 1); i < symbol1; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
