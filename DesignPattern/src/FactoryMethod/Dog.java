package FactoryMethod;

public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }
}
