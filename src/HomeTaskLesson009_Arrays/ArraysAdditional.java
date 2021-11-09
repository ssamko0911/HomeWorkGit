package HomeTaskLesson009_Arrays;

public class ArraysAdditional {

    public static void main(String[] args) {

        int arraySize = 10;
        int [] array = new int[arraySize];

        // Заполняю произвольными 4х значными числами в обратном порядке и вывожу в консоль;

        System.out.println("Вывод значений в обратном порядке: ");
        for (int i = array.length-1; i >=0 ; i--) {
            array[i] = (int) (Math.random()*(9999-1000)+1000);
            System.out.print(array[i] + "\t");
        }

        System.out.format("\nПроверочна строка - значение нулевого индекса массива %d.", array[0]);

    }
}
