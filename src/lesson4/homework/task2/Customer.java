package lesson4.homework.task2;

import java.util.Arrays;

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


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
