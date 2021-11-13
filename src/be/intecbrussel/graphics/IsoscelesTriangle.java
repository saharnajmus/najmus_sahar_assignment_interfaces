package be.intecbrussel.graphics;

public class IsoscelesTriangle extends Triangle {
    private static int count;

    {
        count++;
    }

    //the triangle with two equal sides is isosceles Triangle
    // height
    public IsoscelesTriangle() {
        this(1, 1);
    }

    public IsoscelesTriangle(int width, int height) {
        this(width, height, 1, 1);
    }

    public IsoscelesTriangle(int width, int height, int x, int y) {
        super(width, height, height, x, y);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setPerpendicular(double perpendicular) {
        super.setPerpendicular(perpendicular);
    }

    public static int getCount() {
        return count;
    }

}
