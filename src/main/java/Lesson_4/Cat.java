package Lesson_4;

public class Cat extends Animal {
    private int maxDistanceRunning = 200;
    private int maxDistanceSwimming = 0; // P.S. Технически коты умеют плавать)
    public static int catCount = 0;
    private int appetite;
    public static boolean satiety = false;

    public Cat(String name) {
        super(name);
        super.maxDistanceRunning = maxDistanceRunning;
        super.maxDistanceSwimming = maxDistanceSwimming;
        catCount++;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getCatCount() {
        return catCount;
    }

    public void eat(Plate plate) {
        satiety = plate.setFood(appetite);
    }

    public boolean getSatiety() {
        return satiety;
    }
}

