package be.intecbrussel.graphics;

public class ShapeApp {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 2, 9, 9);
        System.out.println("Area of Rectangle is " + rectangle.getArea());
        Shape square = new Square();
        System.out.println("Perimeter Of Square is " + square.getPerimeter());
        Shape circle = new Circle(44);
        System.out.println("A circle have  " + Circle.ANGLES + " angles");
        Triangle triangle = new Triangle(20, 25, 15);
        System.out.println("Area of Triangle is " + triangle.getArea());
        Shape copyTriangle = new Triangle(triangle);
        System.out.println("Perimeter of triangle " + copyTriangle.getPerimeter());
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(5, 10);
        System.out.println("Width of isoscelesTriangle is " + isoscelesTriangle.getWidth());
        System.out.println("Height of isoscelesTriangle is " + isoscelesTriangle.getHeight());
        System.out.println("Perpendicular of isoscelesTriangle is " + isoscelesTriangle.getPerpendicular());

        System.out.println("Total number of shapes are " + Shape.getCount());
        System.out.println("Total number rectangles are " + Rectangle.getCount());
        System.out.println("Total number squares are " + Square.getCount());
        System.out.println("Total number Circles are " + Circle.getCount());
        System.out.println("Total number of triangles are " + Triangle.getCount());
        System.out.println("Total number of isoscelesTriangle are " + IsoscelesTriangle.getCount());


    }
}
