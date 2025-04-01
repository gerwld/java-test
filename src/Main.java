import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int value;
    do {
        System.out.print("Введи 5: ");
        value = scanner.nextInt();
    }
    while(value!=5);

    System.out.println("Цифра 5 введена успешно");

    }
}
