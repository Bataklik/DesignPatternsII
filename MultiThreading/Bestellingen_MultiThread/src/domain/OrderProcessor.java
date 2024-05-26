package domain;


public class OrderProcessor implements Runnable {
    private OrderQueue orderQueue;

    public OrderProcessor(OrderQueue orderQueue) {
        this.orderQueue = orderQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Order order = orderQueue.QueueTake();
                System.out.println("Taking order " + order.getOrderId() + " from the queue");
                Thread.sleep(order.getProcessingTime());
                System.out.println("Completed processing order " + order.getOrderId());
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
                break; // Verlaat de lus als de thread is onderbroken
            }
        }
    }
}