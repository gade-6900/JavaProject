// Q2: Area, Circle, Rectangle
class Area {
    float radius;
    int len, wid;

    void setRadius(float radius) {
        this.radius = radius;
    }

    void setLengthWidth(int len, int wid) {
        this.len = len;
        this.wid = wid;
    }
}

class Circle extends Area {
    float getCircleArea() {
        return 3.14f * radius * radius;
    }
}

class Rectangle extends Area {
    int getRectArea() {
        return len * wid;
    }
}

public class MainQ2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("Circle Area: " + c.getCircleArea());

        Rectangle r = new Rectangle();
        r.setLengthWidth(10, 4);
        System.out.println("Rectangle Area: " + r.getRectArea());
    }
}
