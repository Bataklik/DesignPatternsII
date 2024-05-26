package cli;

import domain.Order;
import domain.OrderProcessor;
import domain.OrderQueue;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(9, List.of("Zeep", "Handdoek"), 4500),
                new Order(8, List.of("Bak Bier", "Diepvries pizza"), 2000),
                new Order(7, List.of("Olijf olie", "Steak"), 3000),
                new Order(6, List.of("Koffie machine", "Koffie pads"), 3500),
                new Order(5, List.of("Airfryer chickennuggets", "6x M&M's"), 4000)
        );

        OrderQueue orderQueue = new OrderQueue(orders.size());
        orderQueue.addOrders(orders);

        for (int i = 0; i < 3; i++) {
            new Thread(new OrderProcessor(orderQueue)).start();
        }
    }
}