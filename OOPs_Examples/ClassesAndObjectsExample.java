class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println(brand + " " + year);
    }
}

public class ClassesAndObjectsExample {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        car1.display();
    }
}
