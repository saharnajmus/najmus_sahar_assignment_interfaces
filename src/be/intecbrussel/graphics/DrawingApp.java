package be.intecbrussel.graphics;

public class DrawingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Rectangle rectangle = new Rectangle(1000,1500);
       Circle circle = new Circle(25);
        Triangle triangle = new Triangle(10,15);
       drawing.add(rectangle);
        drawing.add(circle);
        drawing.add(triangle);
        TextDrawingContext textDrawingContext = new TextDrawingContext();
        textDrawingContext.draw(rectangle);
        textDrawingContext.draw(circle);
        textDrawingContext.draw(triangle);
        drawing.scale(50);
        drawing.scale(20);
       drawing.scale(250);
       System.out.println("Dimensions of shapes after calling scalable methods");
        drawing.draw(textDrawingContext);


    }
}
