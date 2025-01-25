import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String args[]) {
        String[] words = {
                "Гусь", "Ворон", "Галка", "Беркут", "Гусь", "Гриф",
                "Зяблик", "Галка", "Киви", "Гусь", "Квака", "Беркут", "Беркут"};
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        Set<String> uniqueWords = wordCount.keySet();
        System.out.println();
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord + ": " + wordCount.get(uniqueWord));
        }


            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("Заев", "666-666-66");
            phoneBook.add("Зверев", "222-222-22");
            phoneBook.add("Зорин", "777-777-77");
            phoneBook.add("Зверев", "333-333-33");
            phoneBook.add("Заев", "999-999-99");
            phoneBook.add("Зорин", "111-111-11");
            phoneBook.add("Котович", "666-666-66");
        System.out.println("Поиск по фамилии:");
            System.out.println("Номера для Заева:" + phoneBook.get("Заев"));
            System.out.println("Номера для Зорина:" + phoneBook.get("Зорин"));
            System.out.println("Номера для Зверева:" + phoneBook.get("Зверев"));

            System.out.println("Телефонный справочник:");
            phoneBook.printAll();
        }

    }
