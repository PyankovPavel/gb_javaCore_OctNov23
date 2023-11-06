package lesson4.homework.task2;

import java.util.Arrays;

public class Main {
    /*2. Задача: Эмуляция интернет-магазина
1 - написать классы покупатель, товар и заказ;
2 - создать массив покупателей, массив товаров и массив заказов;
3 - создать статический метод “совершить покупку” со строковыми параметрами, соответствующими полям объекта заказа.
Метод должен вернуть объект заказа
4 - Если в метод передан несуществующий покупатель, товар или отрицательное количество, метод должен выбросить
соответствующее исключение;
5 - Вызвать метод совершения покупки несколько раз таким образом, чтобы заполнить массив покупок возвращаемыми
значениями. Обработать исключения.
6 - Вывести в консоль итоговое количество совершённых покупок после выполнения приложения.*/

    public static void main(String[] args) {
        Customer[] customers = {new Customer("Oleg", 25, 2000),
                new Customer("Ivan", 30, 5000),
                new Customer("Pavel", 35, 4000),
                new Customer("Anastas", 40, 5000)};
        Item[] items = {new Item(10, "Gum"),
                new Item(50, "Milk"),
                new Item(40, "Bread"),
                new Item(100, "Meat"),
                new Item(75, "Beer")};


        Order[] newOrders = {makePurchase(items[3], customers[0]), makePurchase(items[0], customers[2]),
                makePurchase(items[1], customers[1]), makePurchase(items[2], customers[3])};

        System.out.println(Arrays.toString(newOrders));


    }

    public static Order makePurchase(Item someItem, Customer someCustomer) {
        return new Order(someItem, someCustomer);
    }

}
