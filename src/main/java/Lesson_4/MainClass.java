package Lesson_4;

// Задание 5
public class MainClass {
    public static void main(String[] args) {
        int food = 50;
        int appetite = 20;

        Cat[] cats = { new Cat ("Barsik", appetite), new Cat("Lobzik", appetite), new Cat("Murzik", appetite)};
        Plate plate = new Plate(food);
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].getName() + " сыт = " + cats[i].getSatiety()); //Выводим кто сыт а кому не хватило
        }
        plate.info(); // Выводим сколько осталось после того как коты поели

        plate.addFood(20); //Добавление еды
        plate.info();
    }

}
