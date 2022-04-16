package Lesson_4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке: " + food + " еды");
    }

    public void addFood(int count) {
        food += count;
    }

    public boolean setFood(int amount) {
        if (food < amount) {
            System.out.println("Нельзя съесть больше чем есть в тарелке");
            return false;
        } else {
            food -= amount;
            return true;
        }
    }
}

