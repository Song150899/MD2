package Th1.animal;

import Th1.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return " Goal";
    }

    @Override
    public String howToEat() {
        return " Xào lăn";
    }
}
