public class Main {
    public static void main(String[] args) {
        // Создаем массив сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivanivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrova Maria", "Accountant", "maria.pet@mail.com", "89012345678", 40000, 35);
        employees[2] = new Employee("Sidorov Alexey", "Manager", "alex.sidorov@mail.com", "89099876543", 45000, 40);
        employees[3] = new Employee("Kuznetsova Olga", "Designer", "olga.kuz@mail.com", "89345671234", 35000, 28);
        employees[4] = new Employee("Smirnov Sergey", "Developer", "sergey.smir@mail.com", "89999999999", 50000, 32);

        // Вывод информации о сотрудниках
        for (Employee employee : employees) {
            employee.printInfo();
        }

        // Создаем парк и аттракционы
        Park park = new Park("Central Park");
        Park.Attraction rollerCoaster = park.new Attraction("Безумная бочка", "10:00 - 20:00", 700);
        Park.Attraction ferrisWheel = park.new Attraction("Адское месиво", "09:00 - 21:00", 650);

        // Вывод информации об аттракционах
        rollerCoaster.printAttractionInfo();
        ferrisWheel.printAttractionInfo();
    }
}