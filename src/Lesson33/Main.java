package Lesson33;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double probability = (double) 1/ (double) 5;
        System.out.println(probability);



        ///// java <5, до дженериков /////
        List animals = new ArrayList(); // хранит в себе обьекты класса Object
        animals.add("frog");
        animals.add("dog");

        // downcast преобразование
        String animal = (String) animals.get(1);
        System.out.println(animal);

        //////      после        ////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Dog");
        animals2.add("frog");
        animals2.add("Snake");

        // работает без даункаста из-за типизации и дженериков
        System.out.println(animals2.get(2));
    }
}


class Animal {

}