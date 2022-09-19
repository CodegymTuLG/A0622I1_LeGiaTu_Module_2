package ss7_Abstract_Class_And_Interface.Animal_interface_Edible.animal;

import ss7_Abstract_Class_And_Interface.Animal_interface_Edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
