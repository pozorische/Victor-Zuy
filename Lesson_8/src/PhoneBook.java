import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> numberToLastNames = new HashMap<>();
    private HashSet<String> uniqNumbers = new HashSet<>();
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public boolean add(String lastName, String phoneNumber) {
        if (uniqNumbers.contains(phoneNumber)) {
            String existingLastNames = String.join(", ", numberToLastNames.get(phoneNumber));
            System.out.println("Внимание!!!: Номер " + phoneNumber + " уже занят фамилией " + existingLastNames);
            return false;
        }

        uniqNumbers.add(phoneNumber);
        numberToLastNames.putIfAbsent(phoneNumber, new HashSet<>());
        numberToLastNames.get(phoneNumber).add(lastName);

        List<String> numbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(lastName, numbers);
        return true;
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ". Номера: " + entry.getValue());
        }
    }
}