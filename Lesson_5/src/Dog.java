public class Dog extends Animal {
    private static int dogCount = 0;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;
    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Собака пробежала " + distance + "м.");
        } else {
            System.out.println("Собака не может пробежать больше " + maxRunDistance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println("Собака проплыла " + distance + "м.");
        } else {
            System.out.println("Собака не может проплыть больше " + maxSwimDistance + " м.");
        }
    }
}
