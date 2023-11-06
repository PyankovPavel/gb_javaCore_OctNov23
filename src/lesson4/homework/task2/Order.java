package lesson4.homework.task2;

public class Order {
    private Item items;
    private Customer customer;


    public Order(Item items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "" + items +
                " " + customer +
                '}';
    }
}
