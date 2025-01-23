import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Исходный массив
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        // Вывод исходного массива
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Обработка массива: числа меньше 6 умножаются на 2
        modifyArray(array);

        // Вывод изменённого массива
        System.out.println("Изменённый массив: " + Arrays.toString(array));
    }


    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) { // Проверяем, меньше ли число 6
                array[i] *= 2; // Умножаем на 2
            }
        }
    }
}

