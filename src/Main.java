public class Main {
    public static void main(String[] args) {
        System.out.println(isNegative(10));  // false
        System.out.println(isNegative(-5)); // true
        System.out.println(isNegative(0));  // false
    }

    public static boolean isNegative(int number) {
        return number < 0; // Возвращает true, если число отрицательное
    }
}
