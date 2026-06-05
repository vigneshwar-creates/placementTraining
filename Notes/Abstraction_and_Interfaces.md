# Abstraction & Interfaces

### Abstraction
It is the concept of hiding complex implementation details and showing only the essential features of the object.
It can be achieved using abstract classes and interfaces.

**Hides complexity**: Abstraction allows programmers to focus on what the object does instead of how it does it.

### Abstract Class
* Can have both abstract and non-abstract methods.
* Does not support multiple inheritance.
* It has final, non-final, static, and non-static variables.
* They can have static methods, main method and constructor.
* Provides the implementation to the interface.
* `abstract` keyword is used to declare an abstract class.

**Example:**
```java
public abstract class Shape {
    public abstract void draw();
}
```

### Interface
* Have only abstract methods.
* Supports multiple inheritance.
* Cannot have static methods, main method, or constructor.
* Cannot provide the implementation of an abstract class.
* `interface` keyword is used to declare an interface.

**Example:**
```java
public interface Draw {
    void draw();
}
```
