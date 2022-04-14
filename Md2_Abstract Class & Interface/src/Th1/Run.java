package Th1;

import Th1.animal.Animal;
import Th1.animal.Chicken;
import Th1.animal.Tiger;
import  Th1.edible.Edible;
import Th1.Fruit.Fruit;
import  Th1.Fruit.Apple;
import Th1.Fruit.Orange;

public class Run {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for ( Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Tiger ){
                Edible edibler = (Tiger) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new  Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for ( Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }

}

