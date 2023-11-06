package lesson4.homework.task2;

public class Item {
    private int price;
    private String type;

    public Item(int price, String type) {
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
};
