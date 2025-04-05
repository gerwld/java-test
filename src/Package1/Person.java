package Package1;

public class Person {
    public String name;
    protected String address;
    private String surname;
    public final static String CONSTANT = "234l"; // можно readonly глобально

    // по строгости:
    // 1.private - самый строгий, только в пределах класса
    // 2.default (package-private) - дефолтный (не пишется), доступ в пределах пакета
    // 3.protected - то что default() + в наследующих классах
    // 4.public - доступен везде
    //
    //

}
