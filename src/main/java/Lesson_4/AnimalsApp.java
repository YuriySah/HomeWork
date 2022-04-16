package Lesson_4;

public class AnimalsApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Шарик");
        Dog dogRex = new Dog("Рекс");
        Dog dogCaptain = new Dog("Капитан");
        Cat cat = new Cat("Тузя");
        Cat catNinja = new Cat("Ниндзя");
        dog.run(200);
        dog.swim(10);
        cat.run(150);
        cat.swim(0);

        System.out.println("Общее количество собак = "+ dog.getDogCount());
        System.out.println("Общее количество котов = "+ cat.getCatCount());
        System.out.println("Общее количество животных = "+ dog.getAnimalsCount());
    }
}
