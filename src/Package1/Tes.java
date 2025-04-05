package Package1;

public class Tes extends Person {
    public Tes() {
        address = "efb"; // перепись protected через наследование класса Person
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "bod";

    }
}
