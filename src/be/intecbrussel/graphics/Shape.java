package be.intecbrussel.graphics;

public abstract class Shape implements Drawable {
    private static int count;
    private int x;
    private int y;

    {
        count++;
    }

    public Shape() {
        this(1, 1);
    }

    public Shape(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public static int getCount() {
        return count;
    }
}
