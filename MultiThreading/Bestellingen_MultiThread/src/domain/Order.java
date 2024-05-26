package domain;

import java.util.List;

public class Order {

    private int orderId;
    private List<String> items;
    private int processingTime;

    public Order(int orderId, List<String> items, int processingTime) {
        this.orderId = orderId;
        this.items = items;
        this.processingTime = processingTime;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public List<String> getItems() {
        return items;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return String.format("Order: %d, %s, %s miliseconds\n",orderId,items,processingTime);
    }
}