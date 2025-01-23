import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание пустого массива длиной 100
        int[] array = new int[100];

        // Заполнение массива числами от 1 до 100
        fillArray(array);

        // Вывод заполненного массива
        System.out.println("Заполненный массив: " + Arrays.toString(array));
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Записываем в массив число (индекс + 1)
        }
    }
}
