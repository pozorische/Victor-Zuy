public class MainMath {
    public static void main(String[] args) {
        Figure circle = new Circle(3, "синий", "голубой");
        Figure rectange = new Rectangle(3, 4, "красный", "розовый");
        Figure traingle = new Traingle(2, 5, 6, "золотой", "оливковый");

        printFigureInfo("круг", circle);
        printFigureInfo("прямоугольник", rectange);
        printFigureInfo("треугольник", traingle);
    }

    private static void printFigureInfo(String name, Figure figure) {
        System.out.println(name + ":");
        figure.printInfo();
    }
}