public class ClassesAndObjects {
    public static void main (String[] args) {
        Person petya = new Person();
        petya.setName("Petya");
        petya.setAge(21);
        petya.speak();

        int leftToRetirement = petya.getYearsToRetirement();
        System.out.println("Left to retirement: " + leftToRetirement + " years.");

        System.out.println("\nGetter name result: " + petya.getName());
    }
}

class Person {
    private String name;
    private int age;

    public void speak() {
        System.out.println("My name is " + name + ", and im " + age + " years old.");
    }

    int getYearsToRetirement() {
         return 50 - age;
    }

    // Setters
    public void setName(String user_name) {
        if(user_name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }
        name = user_name;
    }
    public void setAge(int user_age) {
        if(user_age < 0) {
            System.out.println("Age cannot be less than 0.");
            return;
        }
        age = user_age;
    }

    // Getters
    public String getName() {return name;}
    public int getAge() {return age;}

}