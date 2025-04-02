public class ClassesAndObjects {
    public static void main (String[] args) {
        Person petya = new Person();
    //  petya.name = "Petya"; // прямое обращение, нарушение инкапсуляции (переназначение)
        petya.setName("Petya");
        petya.age = 21;

        petya.speak();

        int leftToRetirement = petya.getYearsToRetirement();

        System.out.println("Left to retirement: " + leftToRetirement + " years.");

    }
}

class Person {
    String name;
    int age;

    public void speak() {
        System.out.println("My name is " + name + ", and im " + age + " years old.");
    }

    int getYearsToRetirement() {
         return 50 - age;
    }

    void setName(String username) {
        name = username;
    }
}