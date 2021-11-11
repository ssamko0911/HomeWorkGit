/*
Задание 3
Используя IntelliJ IDEA, создайте класс ReversedArray.
Требуется:
1) Создать метод myReverse(int [] array), который принимает в качестве аргумента массив
целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном
порядке).
2) Создайте метод int [] subArray(int [] array, int index, int count). Метод возвращает
часть полученного в качестве аргумента массива, начиная с позиции указанной в аргументе index,
размерностью, которая соответствует значению аргумента count.
Если аргумент count содержит значение больше чем количество элементов, которые входят в
выбираемую часть исходного массива (от указанного индекса index, до индекса последнего элемента),
то при формировании нового массива размерностью в count, заполните единицами те элементы,
которые не были скопированы из исходного массива.
*/


package HomeTaskLesson009_Arrays;

public class ReversedArrayOneLoop {

    public static void main(String[] args) {

        int[] taskArray = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Дан массив: {11, 2, 3, 4, 5, 6, 7, 8, 9, 10}. Метод выводит результат в одном цикле: ");
        subArray(taskArray, 3, 16);
    }

    public static void subArray(int[] array, int index, int count) {
        int[] cuttedExtendedArray = new int[count];
        for (int i = 0; i < count; i++) {
            if (i + index < array.length) {
                cuttedExtendedArray[i] = array[array.length - i - 1 - index];
            } else {
                cuttedExtendedArray[i] = 1;
            }
            System.out.print(cuttedExtendedArray[i] + "\t");
        }
    }
}


