public class Lesson24 {
    public static void main(String[] args) {
        Humanoid human1 = new Humanoid(123);



        System.out.println(human1.toString()); // toString метод класса Class, которым екстендится класс Humanoid, возвращает hash-code обьекта
    }
}


class Humanoid {
    private String name = "$username";
    private int age;
    private static int humansCount;

    public static String description;

    public String toString() { // перепись так как сигнатура совпадает
        return "hash-code";
    }

    // пример перегрузки методов, используется тот чьи параметры пришли
    public Humanoid(int age) {
        System.out.println("constructor 1 init call");
        this.age = age;
        humansCount++;
    }
    public Humanoid(String name, int age) { // constructor как в джаваскрипт constructor()
        System.out.println("constructor 2 init call");
        this.name = name;
        this.age = age;
        humansCount++;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {return name;}
    public int getAge() {return age;}
    public void getInfo() {
        System.out.println(name + " " + age);
    }

    public static void showDescription() {
        System.out.println(description);
        // вывести через sout name не выйдет так как
        // ее контекст не статический
    }

    public static void printNumberOfPeople() {
        System.out.println("Number of humans obj. created: " + humansCount);
    }
}