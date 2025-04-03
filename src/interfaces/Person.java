package interfaces;
// implements как контракт-валидатор
public class Person implements Info  {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.printf("Info: (Name: %s)\n", name);
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
