/*
Задание 4
Используя IntelliJ IDEA, создайте класс UserArray.
Требуется:
Создать метод, который будет выполнять увеличение длины массива переданного в качестве аргумента,
на 1 элемент. Элементы массива, должны сохранить свое значение и порядок индексов.
Создайте метод, который принимает два аргумента, первый аргумент – типа int [] array, второй
аргумент – типа int value. В теле метода реализуйте возможность добавления второго аргумента
метода в массив по индексу 0, при этом длина нового массива, должна увеличиться на 1 элемент, а
элементы получаемого массива в качестве первого аргумента должны скопироваться в новый массив
начиная с индекса 1.
*/

package HomeTaskLesson009_Arrays;

public class UserArrayOneLoop {

    public static void main(String[] args) {
        System.out.println("Программа проводит манипуляции с массивами согласно задачи в одном цикле.");
        int[] taskArray = {1, 2, 3, 4, 5, 6};
        getExtendedArrayFromStart(taskArray, 88);
    }

    public static void getExtendedArrayFromStart(int[] array, int value) {
        int[] extendedArrayFromStart = new int[array.length + 2];
        for (int i = 0; i < extendedArrayFromStart.length; i++) {
            if (i == 0) {
                extendedArrayFromStart[0] = value;
            } else if (i <= array.length) {
                extendedArrayFromStart[i] = array[i - 1];
            }
            System.out.print(extendedArrayFromStart[i] + "\t");
        }
    }

}



