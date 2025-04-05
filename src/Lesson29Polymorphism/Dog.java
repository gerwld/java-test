package Lesson29Polymorphism;

public class Dog extends Animal {

    @Override
    public void eat() { // перепись по сигнатуре
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}
