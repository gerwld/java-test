import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // random
        Random random = new Random();

        double number;
        double number2;
        double number3;

        number = random.nextDouble(0,1);
        number2 = random.nextDouble(0,1);
        number3 = random.nextDouble(0,1);

        boolean isHeads;

        isHeads = random.nextBoolean();

        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);


        System.out.println(isHeads ? "Heads" : "Tails");


    }
}
