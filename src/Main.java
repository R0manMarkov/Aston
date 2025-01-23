import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Исходный массив
        int[] array = {1, 0, 0, 1, 0, 0, 1, 0, 0, 1};

        // Вывод исходного массива
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Замена 0 на 1 и 1 на 0
        invertArray(array);

        // Вывод изменённого массива
        System.out.println("Изменённый массив: " + Arrays.toString(array));
    }

    /**
     * Метод для инвертирования элементов массива (0 -> 1, 1 -> 0)
     * @param array Массив, элементы которого нужно инвертировать
     */
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // Если элемент равен 0, заменить на 1, иначе заменить на 0
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }
}
