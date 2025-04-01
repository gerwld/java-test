import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get the name of a user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //.next if you want to avoid spaces

        // get the age of a user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        double gpa = 0;
        if(isStudent) {
            // get the gpa of a user
            System.out.print("Enter your GPA: ");
            gpa = scanner.nextDouble();
        }

        // output the data
        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old.");
        if(isStudent) {
            System.out.println("You are a student and your GPA is: " + gpa);
        }

        scanner.close();
    }
}
