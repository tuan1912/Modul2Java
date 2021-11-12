package practice.class_animal_and_interface_edible;

public class Main {
    public static void main(String[] args) {
            int a = 0;
            int[] b = {1};
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Animal) {
                System.out.println("hohohoho");
            }

        }
    }
}


