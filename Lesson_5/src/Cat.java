import java.util.ArrayList;

public class Cat extends Animal {
    private static int catCount = 0;
    private final int maxRunDistance = 200;
    public static ArrayList<Cat> catsArrayList = new ArrayList<>();
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        catCount++;
        catsArrayList.add(this);
    }

    public static void createCats(String... names) {
        for (String i : names) {
            new Cat(i);
        }
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean eat(Bowl bowl, int amount) {
        if (bowl.feedCat(amount)) {
            isFull = true;
            System.out.println("Кот поел " + amount + " единиц еды.");
            return true;
        } else {
            System.out.println("Недостаточно еды в миске.");
            return false;
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static void printAllCats() {
        for (Cat i : Cat.catsArrayList) {
            System.out.println(i.toString());
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Kот пробежал " + distance + "м.");
        } else {
            System.out.println("Кот не может пробежать больше " + maxRunDistance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать ");
    }

    @Override
    public String toString() {
        return "Кот " + name + ". Голоден?: " + (isFull ? "сыт" : "голоден");
    }
}
