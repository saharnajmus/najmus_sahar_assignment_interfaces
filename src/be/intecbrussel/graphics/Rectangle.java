package be.intecbrussel.graphics;

public class Rectangle extends Shape {
    private static int count;
    public static final int ANGLES = 4;
    private double width;
    private double height;

    {
        count++;
    }

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this(width, height, 1, 1);

    }

    public Rectangle(double width, double height, int x, int y) {
        setHeight(height);
        setWidth(width);
        setX(x);
        setY(y);
    }

    public Rectangle(Rectangle r) {
        this(r.getWidth(), r.getHeight(), r.getX(), r.getY());
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }

    public void grow(int d) {
        d = Math.abs(d);
        height = height + d;
        width = width + d;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width %f,height %f", width,height);
    }

    @Override
    public void scale(int factor) {
        setHeight((getHeight()/100)*factor);
        setWidth((getWidth()/100)*factor);
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }
}
