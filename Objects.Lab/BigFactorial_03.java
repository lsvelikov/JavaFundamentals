package ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        BigInteger sumBigNumber = new BigInteger(String.valueOf(1));
        for (int i = num; i > 0; i--) {
            sumBigNumber = sumBigNumber.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sumBigNumber);
    }
}
