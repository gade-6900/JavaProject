// Q1: Shape + Display interface
abstract class Shape {
    abstract double area();
}

interface Display {
    void show();
}

class Circle extends Shape implements Display {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public void show() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + area());
    }
}

class Rectangle extends Shape implements Display {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    public void show() {
        System.out.println("Rectangle Length: " + length + ", Width: " + width);
        System.out.println("Rectangle Area: " + area());
    }
}

public class MainQ1 {
    public static void main(String[] args) {
        Display c = new Circle(5);
        c.show();

        Display r = new Rectangle(10, 4);
        r.show();
    }
}
