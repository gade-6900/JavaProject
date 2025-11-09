// Q6: Abstract Shape3D + Interface Printable3D
abstract class Shape3D {
    abstract double volume();
}

interface Printable3D {
    void printShape();
}

class Cube extends Shape3D implements Printable3D {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double volume() {
        return side * side * side;
    }

    public void printShape() {
        System.out.println("Cube Side: " + side);
        System.out.println("Cube Volume: " + volume());
    }
}

class Sphere extends Shape3D implements Printable3D {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public void printShape() {
        System.out.println("Sphere Radius: " + radius);
        System.out.println("Sphere Volume: " + volume());
    }
}

public class ManinQ6 {
    public static void main(String[] args) {
        Printable3D cube = new Cube(4);
        cube.printShape();

        Printable3D sphere = new Sphere(3);
        sphere.printShape();
    }
}
