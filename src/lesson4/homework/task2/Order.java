package lesson4.homework.task2;

public class Order {
    private int number;
    private Items items;
    private Customer customer;

    public int getNumber() {
        return number;
    }

    public Order(int number, Items items, Customer customer) {
        this.number = number;
        this.items = items;
        this.customer = customer;
    }
}
