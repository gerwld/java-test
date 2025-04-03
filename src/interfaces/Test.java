package interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Adam");

        Info animal2 = new Animal(2); // обращение возможно только к методам заданым в интерфейсе

        animal1.sleep();
        person1.sayHello();

        outputInfo(person1); // пример использования
        outputInfo(animal1);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
