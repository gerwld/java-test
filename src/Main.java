import java.util.Arrays;

public class Main {
   public static void main(String[] args) {

       int[] number = {1,2,3}; // одномерный массив
       int[][] matrix = {{1,2,3},
                         {4,5,6}}; // двумерный массив
       int[][][] shlopix = {{{1},{1}}, {{1}, {1}}}; // трехмерный массив


       for (int[] ints : matrix) {
           for (int anInt : ints) {
               System.out.println(anInt);
           }
       }


   }
}
