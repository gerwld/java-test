import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter your age: ");
       int age = scanner.nextInt();

       switch (age) {
           case 10:
               System.out.println("You most likely learning at school.");
               break;
           case 18:
               System.out.println("You ended up school.");
               break;
           default:
               System.out.println("Provide either 10 or 18.");
               main(args);
               scanner.close();
               break;
       }
       scanner.close();
   }
}
