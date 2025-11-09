// Q1: Value, Add, Mul, Div
class Value {
    int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Add extends Value {
    int getAdd() {
        return a + b;
    }
}

class Mul extends Value {
    int getMul() {
        return a * b;
    }
}

class Div extends Value {
    int getDiv() {
        return a / b;
    }
}

public class MainQ1 {
    public static void main(String[] args) {
        Add add = new Add();
        add.setValue(10, 5);
        System.out.println("Addition: " + add.getAdd());

        Mul mul = new Mul();
        mul.setValue(10, 5);
        System.out.println("Multiplication: " + mul.getMul());

        Div div = new Div();
        div.setValue(10, 5);
        System.out.println("Division: " + div.getDiv());
    }
}