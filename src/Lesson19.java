public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human("Adam", 22);
        human1.getInfo();
    }
}

class Human {
    private String name = "$username";
    private int age;

    // пример перегрузки методов, используется тот чьи параметры пришли
    public Human(int age) {
        System.out.println("constructor 1 init call");
        this.age = age;
    }
    public Human(String name, int age) { // constructor как в джаваскрипт constructor()
        System.out.println("constructor 2 init call");
        this.name = name;
        this.age = age;
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
}