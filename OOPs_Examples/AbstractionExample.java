abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        
        Drawable d = new Rectangle();
        d.draw();
    }
}
