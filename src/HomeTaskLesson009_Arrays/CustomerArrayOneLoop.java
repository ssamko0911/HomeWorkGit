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

        int [] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};

        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
            if (array[i]>max){
                max = array[i];
            }
            sum+=array[i];

            //if (array)
        }
        double average = sum/ array.length;

        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + max);
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
    }

}
