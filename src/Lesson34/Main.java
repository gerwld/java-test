package Lesson34;
import java.util.ArrayList;
import java.util.List;

import Lesson29Polymorphism.*;

public class Main {
   public static void main(String[] args) {
       List<Animal> listOfAnimal = new ArrayList();
       listOfAnimal.add(new Animal(1));
       listOfAnimal.add(new Animal(2));

       List<Dog> listOfDogs = new ArrayList();
       listOfDogs.add(new Dog(1));
       listOfDogs.add(new Dog(2));

       test(listOfAnimal);
       test(listOfDogs);
   }

    //- Object
    //-- Animal
    //--- Dog

    // в этом случае, <?extends> = все что Animal и ниже, а super - выше. (Object)
   private static void test(List<? extends Animal> list) {
       for (Animal animal : list) {
           animal.eat();
           System.out.println(animal.id);
       }
   }
}
