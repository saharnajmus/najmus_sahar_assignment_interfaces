package be.intecbrussel.graphics;

public class Rectangle extends Shape {
    private static int count;
    public static final int ANGLES = 4;
    private int width;
    private int height;

    {
        count++;
    }

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(int width, int height) {
        this(width, height, 1, 1);

    }

    public Rectangle(int width, int height, int x, int y) {
        setHeight(height);
        setWidth(width);
        setX(x);
        setY(y);
    }

    public Rectangle(Rectangle r) {
        this(r.getWidth(), r.getHeight(), r.getX(), r.getY());
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = Math.abs(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = Math.abs(height);
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
        return String.format("Rectangle with width %d,height %d at position (%d,%d)", width,height,getX(),getY());
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
