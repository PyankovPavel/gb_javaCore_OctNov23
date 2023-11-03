package lesson4.homework.task2;

public class Customer {
    private String name;
    private int age;
    private int money;

    public Customer(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMoney() {
        return money;
    }
}