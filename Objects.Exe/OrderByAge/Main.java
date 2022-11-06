package ObjectsAndClasses.Exe.OrderByAge;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Order> orderList = new ArrayList<>();
        while (!input.equals("End")){
            Order order = new Order(input.split("\\s+")[0], input.split("\\s+")[1], Integer.parseInt(input.split("\\s+")[2]));

            orderList.add(order);

            input = scanner.nextLine();
        }
        orderList.sort(Comparator.comparing(Order::getAge));
        for (Order person : orderList) {
            System.out.println(person);
        }
    }
}
