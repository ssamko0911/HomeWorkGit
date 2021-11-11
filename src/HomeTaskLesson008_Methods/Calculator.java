package HomeTaskLesson008_Methods;

/*
Задание
Используя IntelliJ IDEA, создайте класс Calculator.
Создайте метод с именем calculate, который принимает в качестве параметров три целочисленных
значения и возвращает значение каждого аргумента, деленного на 5.
*/

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Программа принимает 3 числа и делит их на 5.\nВведите через \"Enter\" 3 числа: ");
        Scanner in = new Scanner(System.in);
        System.out.println(getNumbersCalculation(in.nextInt(), in.nextInt(), in.nextInt()));
    }

    public static String getNumbersCalculation(int a, int b, int c) {
        return String.format("Результат деления всех чисел на 5:\n1) %.2f;\n2) %.2f;\n3) %.2f.",
                (double) a / 5, (double) b / 5, (double) c / 5);
    }

}
