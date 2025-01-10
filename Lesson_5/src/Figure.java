public interface Figure {
    double getArea();

    double getPerimeter();

    String getFillColor();

    String getBorderColor();

    default double calculatePerimeter() {
        return getPerimeter();
    }

    default double calculateArea() {
        return getArea();
    }

    default void printInfo() {
        System.out.println("Площадь: " + getArea() + ". Периметр: " + getPerimeter() + ". Цвет границ: " + getBorderColor() + ". цвет фона: " + getFillColor());
    }
}
