package Lesson30;

// 30 приведение типов данных
public class Test {
    public static void main(String[] args) {
        // примитивные типы данных
        short x = 123;
        byte b = (byte) 200; // -128 до 127

        System.out.println(b); // переход на следующий байт 127 = -56 числового ряда

        long v = 123;
        double a = 12.3; // 64 бита, вещестеннные числа
        float g = 12.2f; // 32 бита, меньше дабл

        float f = 123.2f; // f or F
        long d = 43000l; // l or L
        long d2 = (long) 43000; // альтернативный вариант

        long xc = x; // приведение явное, происходит само
        int l = (int) d; // приведение неявное

        double doub = 23.3;
        int nodoub = (int) doub; // преобразование
        long nodoub2 = Math.round(doub);

        System.out.println(l);
    }
}
