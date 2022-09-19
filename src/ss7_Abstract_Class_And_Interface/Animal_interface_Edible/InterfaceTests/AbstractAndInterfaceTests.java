package ss7_Abstract_Class_And_Interface.Animal_interface_Edible.InterfaceTests;

import ss7_Abstract_Class_And_Interface.Animal_interface_Edible.animal.Animal;
import ss7_Abstract_Class_And_Interface.Animal_interface_Edible.animal.Chicken;
import ss7_Abstract_Class_And_Interface.Animal_interface_Edible.animal.Tiger;
import ss7_Abstract_Class_And_Interface.Animal_interface_Edible.edible.Edible;
import ss7_Abstract_Class_And_Interface.Animal_interface_Edible.fruit.Fruit;
import ss7_Abstract_Class_And_Interface.Animal_interface_Edible.fruit.Orange;
import ss7_Abstract_Class_And_Interface.Animal_interface_Edible.fruit.Apple;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
