package domain;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class OrderQueue {

    private final BlockingQueue<Order> queue;

    public OrderQueue(int size) {
        queue = new ArrayBlockingQueue<>(size);
    }

    public void addOrders(List<Order> orders) {
        queue.addAll(orders);
    }

    public void QueuePut(Order order) throws InterruptedException {
        queue.put(order);
    }

    public Order QueueTake() throws InterruptedException {
        return queue.take();
    }
}