public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human("Adam", 22);
        human1.getInfo();

        // description принадлежит классу Human, а не
        // обьекту (например, human1)
        Human.description = "пример использования static";
        Human.showDescription();

        // description здесь будет тот же из-за static
        Human human2 = new Human("Peter", 62);
        human2.getInfo();

        // из-за static можно выводить колличество людей
        Human.printNumberOfPeople();
        human1.printNumberOfPeople();
        human2.printNumberOfPeople();
    }
}

class Human {
    private String name = "$username";
    private int age;
    private static int humansCount;

    public static String description;

    // пример перегрузки методов, используется тот чьи параметры пришли
    public Human(int age) {
        System.out.println("constructor 1 init call");
        this.age = age;
        humansCount++;
    }
    public Human(String name, int age) { // constructor как в джаваскрипт constructor()
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