import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
     String f = new String("3");
//     System.out.println(f);

     // инициализация массива чисел numbers, которая содержит
     // ccылку на новый обьект класса массив (?) с размером 5
     int[] numbers = new int[5];

     numbers[0] = 10;

     // инициализация в цикле
     for (int i = 0; i<numbers.length; i++) {
        numbers[i] = i+1;
     }

     // инициализация заранее
     int[] numbers1 = {1,2,3};

       for (int i : numbers1) {
           System.out.println(i);
       }
   }
}
