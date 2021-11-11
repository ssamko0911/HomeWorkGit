/*
Задание 2
Используя IntelliJ IDEA, создайте класс CustomerArray.
Требуется:
Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер
массива задает пользователь).
Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму всех
элементов, среднее арифметическое всех элементов, вывести все нечетные значения. */

package HomeTaskLesson009_Arrays;

public class CustomerArrayOneLoop {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        System.out.println("Программа проводит манипуляции с массивом {11, 22, 33, 44, 55, 66, 77, 88, 99, 100} " +
                "согласно задачи в одном цикле.");
        resolveTasks(array);
    }

    public static void resolveTasks(int[] someArray) {
        int max = someArray[0];
        int min = someArray[0];
        int sum = 0;
        System.out.println("Вывод нечётных: ");
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] % 2 != 0) {
                System.out.print(someArray[i] + "\t");
            }
            if (someArray[i] < min) {
                min = someArray[i];
            }
            if (someArray[i] > max) {
                max = someArray[i];
            }
            sum += someArray[i];
        }
        double average = (double) sum / someArray.length;
        System.out.println();
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + max);
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
    }

}
