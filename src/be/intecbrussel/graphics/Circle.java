package be.intecbrussel.graphics;

public class Circle extends Shape {
    public static final int ANGLES = 0;
    private static int count;
    private int radius;

    {
        count++;
    }

    public Circle() {
        this(1);
    }

    public Circle(int radius) {
        this(radius, 1, 1);
    }

    public Circle(int radius, int x, int y) {
        setRadius(radius);
        setX(x);
        setY(y);
    }

    public Circle(Circle c) {
        this(c.getRadius(), c.getX(), c.getY());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double getPerimeter() {
        return radius * 3.14 * 2;
    }

    public void grow(int d) {
        d = Math.abs(d);
        radius = radius + d;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void scale(int factor) {
        setRadius((getRadius()/100)*factor);
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }
}
