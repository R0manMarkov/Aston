import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Размер квадратного массива
        int n = 5;

        // Создание двумерного массива размером n x n
        int[][] matrix = new int[n][n];

        // Заполнение главной диагонали единицами
        fillMainDiagonal(matrix);

        // Вывод массива на экран
        printMatrix(matrix);
    }


    public static void fillMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1; // Главная диагональ: индексы [i][i]
        }
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

