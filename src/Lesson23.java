public class Lesson23 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        // method chaining
        sb.append(" my").append(" friend.");

        System.out.println(sb.toString());
    }
}
