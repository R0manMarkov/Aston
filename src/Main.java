public class Main {
    public static void main(String[] args) {
        // Пример вызова метода
        System.out.println(isSumInRange(5, 10)); // true
        System.out.println(isSumInRange(15, 10)); // false
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b; // Вычисляем сумму
        return sum >= 10 && sum <= 20; // Проверяем условие
    }
}
