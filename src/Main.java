public class Main {
    public static void main(String[] args) {
        // Пример вызова метода
        int year = 2024;
        boolean isLeap = isLeapYear(year);
        System.out.println("Год " + year + (isLeap ? " високосный" : " не високосный"));
    }

    public static boolean isLeapYear(int year) {
        // Условие високосного года
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
