package HomeTaskLesson009_Arrays;

/*
No lines changed: content is already properly formatted
Принял решение выполнять задание методами.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerArray {


    public static void main(String[] args) throws IOException {

        System.out.println("Программа выполняет разные манипуляции со значениями массива. Введите размер массива: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[Integer.parseInt(in.readLine())];
        fillArray(array);
        System.out.print("Проверочная строка значений массива: ");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.print(array[i] + ", ");
            else
                System.out.print(array[i] + ".\n");
        }
        System.out.printf("Максимальное значение в массиве равно %d.\n", getMax(array));
        System.out.printf("Минимальное значение в массиве равно %d.\n", getMin(array));
        System.out.printf("Сумма всех значний массива равна %d.\n", getSum(array));
        System.out.printf("Среднее значний массива равно %.2f.\n", getAverage(array));
        System.out.print("Нечётные значения массива: ");
        getOdds(array);
        in.close();
    }

    public static void fillArray(int[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = (int) (Math.random() * (50 - 5) + 5);
        }
    }

    public static int getMax(int[] someArray) {
        int max = someArray[0];
        for (int everyElement : someArray) {
            if (everyElement > max) {
                max = everyElement;
            }
        }
        return max;
    }

    public static int getMin(int[] someArray) {
        int min = someArray[0];
        for (int everyElement : someArray) {
            if (everyElement < min) {
                min = everyElement;
            }
        }
        return min;
    }

    public static int getSum(int[] someArray) {
        int sum = 0;
        for (int everyElement : someArray) {
            sum += everyElement;
        }
        return sum;
    }

    public static double getAverage(int[] someArray) {
        return (double) getSum(someArray) / someArray.length;
    }

    public static void getOdds(int[] someArray) {
        for (int everyElement : someArray) {
            if (everyElement % 2 != 0)
                System.out.print(everyElement + " ");
        }

    }

}



