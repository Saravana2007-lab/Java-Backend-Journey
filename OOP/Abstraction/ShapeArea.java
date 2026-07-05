package Abstraction;
abstract class Shape{
    String color;
    Shape(String color){
        this.color = color;
    }
    void display(){
        System.out.println("Color:  "+ color);
    System.out.println("Area is:    "+ CalculateArea());
    }
    abstract double CalculateArea();
}

class Circle extends Shape{
    double radius;
    Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    double CalculateArea() {
        return 3.14*radius*radius ;
    }
       void display(){
        super.display();
    }
}
class Rectangle extends Shape{
    double length;double width;
    Rectangle(String color,double length,double width){
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    double CalculateArea() {
        return length * width;
    }
       void display(){
        super.display();
    }
}
public class ShapeArea {
    public static void main(String[] args) {
        Shape[] sp = {
            new Circle("red",6.54),
            new Rectangle("Green", 4.54, 6.7)
        };
        for(Shape s : sp){
            s.display();
            System.out.println("===========================");
        }
    }
    
}
