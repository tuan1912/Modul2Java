package practice.class_animal_and_interface_edible;

public class Tiger extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "roar";
    }

    @Override
    public String howToEat() {
        return "grill";
    }
}
