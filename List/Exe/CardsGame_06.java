package Fundamentals.List.Exe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> cardsPlayer1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> cardsPlayer2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < cardsPlayer1.size(); i++) {
            int card1 = cardsPlayer1.get(i);
            int card2 = cardsPlayer2.get(i);
            if (card1 > card2) {
                cardsPlayer1.add(cardsPlayer1.get(i));
                cardsPlayer1.add(cardsPlayer2.get(i));
                cardsPlayer1.remove(i);
                cardsPlayer2.remove(i);
            } else if (card1 < card2) {
                cardsPlayer2.add(cardsPlayer2.get(i));
                cardsPlayer2.add(cardsPlayer1.get(i));
                cardsPlayer2.remove(i);
                cardsPlayer1.remove(i);
            } else {
                cardsPlayer1.remove(i);
                cardsPlayer2.remove(i);
            }
            if (cardsPlayer1.isEmpty() || cardsPlayer2.isEmpty()){
                break;
            }
            i--;
        }
        int sum = 0;
        if (cardsPlayer2.isEmpty()){
            for (int number : cardsPlayer1) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }else{
            for (int number : cardsPlayer2) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
