public class Main {
    public static void main(String[] args) {
        // Пример вызова метода
        printStringMultipleTimes("Привет, мир!", 5);
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}
