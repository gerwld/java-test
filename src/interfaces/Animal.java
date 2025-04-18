package interfaces;

public class Animal implements Info {
    public final int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I'm sleeping.");
    }

    public void showInfo() {
        System.out.printf("Info: (ID: %s)\n", id);
    }
}
