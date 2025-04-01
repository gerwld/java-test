import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //shopping cart

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("How much does it cost? ");
        price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What is the total count you want? ");
        quantity = scanner.nextInt();
        scanner.nextLine();

        total = quantity * price;

        System.out.println("\nYou have bougth " + quantity + " " + item + "/s " + price + " each, \nYour total is " + currency + total);


    }
}
