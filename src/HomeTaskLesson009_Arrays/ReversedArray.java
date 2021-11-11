package HomeTaskLesson009_Arrays;

/*

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

No lines changed: content is already properly formatted
*/

public class ReversedArray {


    public static void main(String[] args) {

        int[] taskArray = {11, 18, 77, 88, 19, 87, 0, 15, 18, 22};

        System.out.print("Задан массив:\n");
        printArray(taskArray);
        System.out.println("Решение первой части задачи: ");
        printArray(myReverse(taskArray));
        System.out.println("Решение второй части задачи: ");
        printArray(subArray(taskArray, 5, 17));
    }

    public static int[] myReverse(int[] array) {
        int[] backorderedArray = new int[array.length];
        for (int i = backorderedArray.length - 1; i >= 0; i--) {
            backorderedArray[i] = array[array.length - 1 - i];
        }
        return backorderedArray;
    }

    public static int[] subArray(int[] array, int index, int count) {
        int[] cuttedArray = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (i + index < array.length) {
                cuttedArray[i] = array[i + index];
            }
        }

        for (int j = array.length - index; j < count; j++) {
            if (array.length - index < 0) {
                break;
            }
            cuttedArray[j] = 1;
        }
        return cuttedArray;
    }

    public static void printArray(int[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            if (i != someArray.length - 1) {
                System.out.print(someArray[i] + ", ");
            } else {
                System.out.println(someArray[i] + ".");
            }
        }
    }

}

