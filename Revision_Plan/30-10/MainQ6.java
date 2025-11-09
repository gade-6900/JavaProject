// Q6: Shape, Rectangle, Triangle, Square
class Shape {
    int dim1, dim2;

    void setDimensions(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
}

class Rectangle extends Shape {
    int getArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    float getArea() {
        return (dim1 * dim2) / 2.0f;
    }
}

class Square extends Shape {
    int getArea() {
        return dim1 * dim1;
    }
}

public class MainQ6 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setDimensions(10, 5);
        System.out.println("Rectangle Area: " + r.getArea());

        Triangle t = new Triangle();
        t.setDimensions(10, 5);
        System.out.println("Triangle Area: " + t.getArea());

        Square s = new Square();
        s.setDimensions(5, 0);
        System.out.println("Square Area: " + s.getArea());
    }
}
