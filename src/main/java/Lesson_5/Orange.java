package Lesson_5;

public class Orange extends Fruit {
    public static float orangeWeightBox = 0;
    private static final float orangeWeight = 1.5f;

    public Orange() {
        super(orangeWeight);
    }

    public float getOrangeWeightBox() {
        return orangeWeightBox;
    }

    public void addOrangeBox() {
        orangeWeightBox = orangeWeightBox + orangeWeight;
    }
}
