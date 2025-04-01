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

    abob();
    }

    public static void abob() {
        int i = 0;
        while(true) {
            i++;
            System.out.println(i);
            if(i == 500) {
                break;
            }
        }

        for(int l = 0; l < 100; l++) {
            if(l%2==0) {
                // it skips the rest of the part of the cycle body
                continue;
            }
            System.out.println("Нечетное:" + l);
        }
    }
}
