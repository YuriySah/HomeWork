package Lesson_4;

public class Dog extends Animal {
    private int maxDistanceRunning = 500;
    private int maxDistanceSwimming = 10;
    public static int dogCount = 0;

    public Dog (String name){
        super(name);
        super.maxDistanceRunning = maxDistanceRunning;
        super.maxDistanceSwimming = maxDistanceSwimming;
        dogCount++;
    }
    public int getDogCount(){
        return dogCount;
    }
}

