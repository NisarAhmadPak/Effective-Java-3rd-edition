package org.example;

// Parent Interface
interface Animal1 {
    void speak();
}

// Subtype 1
class Dog1 implements Animal1 {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

// Subtype 2
class Cat1 implements Animal1 {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

// Factory Class with Static Factory Method
public class AnimalFactory1 {
    // Static factory method returning different subtypes
    public static Animal1 getAnimal(String animalName) {
        try {
                // Dynamically load the class based on the name passed
                String className = "org.example." + animalName;
                return (Animal1) Class.forName(className).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new IllegalArgumentException("Animal not found: " + animalName);
            }
    }

    public static void main(String[] args) {
        AnimalFactory1.getAnimal("Horse").speak();
    }
}

