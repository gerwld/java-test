public class Main {
    public static void main(String[] args) {

        /*
        primitives: STACK(double int char boolean) - stored in memory
        reference values: HEAP(string, array, object) - memory access, not written directly in memory
         */

        // string is a series of chars, that's why its heap
        String name = "some string";
        String food = "another one";
        String email = "pjaworskidev@gmail.com";

        System.out.println("Email: " + email);
    }
}
