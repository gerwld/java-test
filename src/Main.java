import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      // calc area of a rect
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("RESULT: " + area + " cm²");


        scanner.close();
    }
}
