import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee victor = new Employee("Зуй Виктор Дмитриевич", "Junior", "blalala@gmail.com", "21313434134",
                500.5, 23);
        victor.printInfo();

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Зуй Игорь Дмитриевич", "Junior", "vsdvc@gmail.com", "21313434134",
                450.5, 42);
        empArray[1] = new Employee("Зуй Игорь Дмитриевич", "Junior", "vsdvc@gmail.com", "21313434134",
                450.5, 42);
        empArray[2] = new Employee("Зуй Игорь Дмитриевич", "Junior", "vsdvc@gmail.com", "21313434134",
                450.5, 42);
        empArray[3] = new Employee("Зуй Игорь Дмитриевич", "Junior",
                "vsdvc@gmail.com", "21313434134", 450.5, 42);
        empArray[4] = new Employee("Зуй Игорь Дмитриевич", "Junior", "vsdvc@gmail.com", "21313434134",
                450.5, 42);
        System.out.println(Arrays.toString(empArray));

        Park gorkogo = new Park("Парк Горького","С 10.00 до 22.00");
        gorkogo.addAttraction("Качели","9:00 - 18:00",50);
        gorkogo.addAttraction("Карусель","14:00-16:00", 100);
        System.out.println(gorkogo);
        gorkogo.setParkName("djfhjdsfj");
        System.out.println(gorkogo);
    }


}




