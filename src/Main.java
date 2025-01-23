public class Main {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 5;  // Пример значения переменной a
        int b = -10; // Пример значения переменной b

        int sum = a + b; // Суммируем переменные

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
