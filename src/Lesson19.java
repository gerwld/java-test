public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(19);
        human1.setName("Adam");

        human1.getInfo();
    }
}

class Human {
    String name;
    int age;

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