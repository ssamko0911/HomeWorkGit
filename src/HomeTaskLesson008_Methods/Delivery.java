package HomeTaskLesson008_Methods;

/*
Имеется N клиентов, которым компания производитель должна доставить товар. Сколько существует
возможных маршрутов доставки товара, с учетом того, что товар будет доставлять одна машина?
Используя IntelliJ IDEA, создайте класс Delivery.
Напишите программу, которая будет рассчитывать и выводить на экран количество возможных вариантов
доставки товара. Для решения задачи, используйте факториал N!, рассчитываемый с помощью рекурсии.
Объясните, почему не рекомендуется использовать рекурсию для расчета факториала. Укажите слабые
места данного подхода.
*/

public class Delivery {

    public static void main(String[] args) {

        int numberOfCustomers = 8;
        System.out.format("Программа производит рассчёт количества маршрутов для %d клиентов.", numberOfCustomers);
        System.out.format("\nКоличество маршрутов равно: %d", calculateRoutes(numberOfCustomers));
    }
    //почему не рекомендуется использовать рекурсию - потому что пока не разобрался как она работает.

    public static int calculateRoutes(int customers) {
        if (customers == 0)
            return 1;
        else
            return customers * calculateRoutes(customers - 1);
    }

}
