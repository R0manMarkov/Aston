public class Main {
    public static void main(String[] args) {
        printNumberSign(10);  // Положительное
        printNumberSign(-5);  // Отрицательное
        printNumberSign(0);   // Положительное
    }

    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
