public class Lesson23_1 {

    public static void main(String[] args ) {
        System.out.printf("This is a string, %s", "NICE");
        System.out.printf("\n%fThis is a digit, %d. Also, %d", 2.4, 20, 20);


        System.out.printf("Spec%d: %10d\n",1, 20); // %10d - фикс ширина digit
        System.out.printf("Spec%d: %10d\n",2, 200);
        System.out.printf("Spec%d: %10d\n",3, 2000);
        System.out.printf("Spec%d: %10d\n",4, 350);
        System.out.printf("Spec%d: %10d\n",5, 23000);


        System.out.printf("Spec%d: %10.2f\n",5, 2.42003);
        System.out.printf("Spec%d: %10.2f\n",5, 5.4501);
        System.out.printf("Spec%d: %10.2f\n",5, 3.420001);
    }
}
