package Lesson35;

class Animal {
   public void eat() {
       System.out.println("Animal is eating...");
   }
}

class OtherAnimal extends Animal { // переопределение метода по принципу наследования
    public void eat() {

    }
}

public class Main {
    public static void main(String[] args) {
        // внутри лежит анонимный подкласс Animal (Class extends Animal)
        Animal animal = new Animal() {
            public void eat() { // переопределение созданием анонимного класса

            }
        };
    }
}
