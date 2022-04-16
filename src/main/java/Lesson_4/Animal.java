package Lesson_4;

public class Animal {
    protected String name;
    protected int maxDistanceRunning;
    protected int maxDistanceSwimming;
    public static int animalsCount = 0;

    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public Animal() {
    }

    public void run(int distance) {
        if (distance <= this.maxDistanceRunning) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " пробежал " + maxDistanceRunning + " м устал.");
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
        //System.out.println("\n");
    }

    public void swim(int distance) {
        if (this.maxDistanceSwimming == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= this.maxDistanceSwimming) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " проплыл " + maxDistanceSwimming + " м устал.");
            System.out.println(name + " не может плыть больше.");
        }
        //System.out.println("\n");
    }

    public String getName() {
        return name;
    }

    public int getAnimalsCount() {
        return animalsCount;
    }
}
