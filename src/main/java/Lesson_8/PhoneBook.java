package Lesson_8;

import java.util.HashMap;

public class PhoneBook {

    public static void main(String[] args) {

        PhoneBookList phoneBookList = new PhoneBookList();
        phoneBookList.add("+380977778800", "Сидоров");
        phoneBookList.get("Сидоров");
    }
}

class PhoneBookList {
    public HashMap<String, String> phoneBook = new HashMap<>();

    public PhoneBookList() {
        phoneBook.put("+380988745800", "Иванов");
        phoneBook.put("+380508432811", "Петров");
        phoneBook.put("+380508432812", "Кузнецов");
        phoneBook.put("+380679998811", "Иванов");
        phoneBook.put("+380630009922", "Сидоров");
        phoneBook.put("+380501232001", "Иванов");
        phoneBook.put("+380995457796", "Кузнецов");
        phoneBook.put("+380500000999", "Петров");
    }

    public void add(String key, String value) {
        phoneBook.put(key, value);
    }

    public void get(String value) {
        for (HashMap.Entry<String, String> entry : phoneBook.entrySet()) {
            if ((entry.getValue()).equals(value)) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}