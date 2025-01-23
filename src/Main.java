import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        // Пример вызова метода
        int len = 10;
        int initialValue = 5;

        // Создание массива
        int[] resultArray = createArray(len, initialValue);

        // Вывод массива на экран
        System.out.println("Результирующий массив: " + Arrays.toString(resultArray));
    }


    public static int[] createArray(int len, int initialValue) {
        // Создаём массив заданной длины
        int[] array = new int[len];

        // Заполняем массив значением initialValue
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array; // Возвращаем заполненный массив
    }
}


