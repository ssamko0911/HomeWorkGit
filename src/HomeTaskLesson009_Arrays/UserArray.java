package HomeTaskLesson009_Arrays;

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
No lines changed: content is already properly formatted
 */

public class UserArray {

    public static void main(String[] args) {
        System.out.println("Программа проводит манипуляции с массивами.");
        int[] taskArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Дан произвольный массив: ");
        printArray(taskArray);
        System.out.println("\nМетод с добавлением ещё одного элемента в конец: ");
        printArray(getExtendedArray(taskArray));
        System.out.println("\nМетод с добавлением ещё одного элемента в начало (значение 0го элемента 99): ");
        printArray(getExtendedArrayFromStart(taskArray, 88));
    }

    public static int[] getExtendedArray(int[] someArray) {
        int[] extendedArray = new int[someArray.length + 1];
        for (int i = 0; i < extendedArray.length; i++) {
            if (i <= someArray.length - 1)
                extendedArray[i] = someArray[i];
        }
        return extendedArray;
    }

    public static int[] getExtendedArrayFromStart(int[] array, int value) {
        int[] extendedArrayFromStart = new int[array.length + 1];
        extendedArrayFromStart[0] = value;
        for (int i = 1; i < extendedArrayFromStart.length; i++) {
            if (i <= array.length)
                extendedArrayFromStart[i] = array[i - 1];
        }
        return extendedArrayFromStart;
    }

    public static void printArray(int[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            if (i != someArray.length - 1)
                System.out.print(someArray[i] + ", ");
            else
                System.out.print(someArray[i] + ".");

        }
    }

}
