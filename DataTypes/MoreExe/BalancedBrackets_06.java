package Fundamentals.DataTypes.MoreExe;

import java.util.Scanner;

public class BalancedBrackets_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int openingCounter = 0;
        int closingCounter = 0;
        int startsOpen = 0;
        int startsClosing = 0;
        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();

            if (word.equals("(")){
                openingCounter++;
                closingCounter = 0;
                startsOpen++;
            }else if (word.equals(")")){
                closingCounter++;
                openingCounter = 0;
                startsClosing++;
            }
            if (openingCounter > 1 || closingCounter > 1){
                break;
            }
            if (startsClosing > startsOpen){
                break;
            }
        }
        if (startsOpen == startsClosing){
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }
    }
}
