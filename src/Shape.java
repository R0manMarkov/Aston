interface Shape {
    double getArea();

    double getPerimeter();

    String getFillColor();

    String getBorderColor();

    default void printDetails() {
        System.out.println("Фигура: " + this.getClass().getSimpleName());
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println();
    }
}
