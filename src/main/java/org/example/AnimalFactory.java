package org.example;

// Parent Interface
interface Animal {
    void speak();
}

// Subtype 1
class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

// Subtype 2
class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

// Factory Class with Static Factory Method
public class AnimalFactory {
    // Static factory method returning different subtypes
    public static Animal getAnimal(String type) {
        return switch (type.toLowerCase()) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            default -> throw new IllegalArgumentException("Unknown animal type: " + type);
        };
    }
}

