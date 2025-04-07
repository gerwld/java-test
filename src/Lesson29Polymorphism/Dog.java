package Lesson29Polymorphism;

public class Dog extends Animal {

    public Dog(int id) {
        super(id);
        // еще можно вызывать методы родительского класса если
        // переопределен в дочернем, используя super.someMethod()
    }


    @Override
    public void eat() { // перепись по сигнатуре
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

}
