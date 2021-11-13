package be.intecbrussel.graphics;

public class TextDrawingContext implements DrawingContext {
    @Override
    public void draw(Rectangle rectangle) {
        System.out.println("Width of rectangle is " + rectangle.getWidth());
        System.out.println("Length of rectangle is " + rectangle.getHeight());
    }

    @Override
    public void draw(Circle circle) {
        System.out.println("Radius of circle is " + circle.getRadius());

    }

    @Override
    public void draw(Triangle triangle) {
        System.out.println("Width of triangle is " + triangle.getWidth());
        System.out.println("Length of triangle is " + triangle.getHeight());


    }
}
