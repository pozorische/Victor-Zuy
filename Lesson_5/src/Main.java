//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Старт");
        System.out.println("Имя собаки: " + dog.getName());
        dog.run(220);
        dog.swim(4);
        Dog dog1 = new Dog("Антея");
        System.out.println("Имя собаки: " + dog1.getName());
        dog1.run(428);
        dog1.swim(17);
        Dog dog2 = new Dog("Успех");
        System.out.println("Имя собаки: " + dog2.getName());
        dog2.run(322);
        dog2.swim(34);
        Cat cat = new Cat("Фрост");
        System.out.println("Имя кота: " + cat.getName());
        cat.run(123);
        cat.swim(5);
        System.out.println("Общее количество животных " + Animal.getCount());
        System.out.println("Количество собак " + Dog.getDogCount());
        System.out.println("Количество котов " + Cat.getCatCount());
        Bowl bowl = new Bowl(50);

        Cat.createCats("Китик", "Ася", "Ричард", "Форест", "Булка", "Батон", "Крендель", "Кися");
        System.out.println("Количество котов " + Cat.getCatCount());

        for (Cat i : Cat.catsArrayList) {
            i.eat(bowl, 8);
        }

        Cat.printAllCats();

        System.out.println("Осталось еды в миске: " + bowl.getFoodAmount() + " единиц.");
        bowl.addFood(8);
        System.out.println("Добавлена еда. В миске: " + bowl.getFoodAmount() + " единиц еды.");
    }
}
