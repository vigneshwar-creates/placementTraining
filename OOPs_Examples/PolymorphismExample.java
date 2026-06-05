class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        MathOperation op = new MathOperation();
        System.out.println(op.add(5, 10));
        System.out.println(op.add(5.5, 10.5));

        Animal myAnimal = new Cat();
        myAnimal.sound();
    }
}
