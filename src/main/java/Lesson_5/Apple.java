package Lesson_5;

public class Apple extends Fruit {
    public static float appleWeightBox = 0;
    private static final float appleWeight = 1.0f;

    public Apple () {
        super(appleWeight);
    }
    public float getAppleWeightBox(){
        return appleWeightBox;
    }
    public void addAppleBox(){
        appleWeightBox = appleWeightBox + appleWeight;
    }
}