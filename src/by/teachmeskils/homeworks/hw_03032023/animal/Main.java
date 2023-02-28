package by.teachmeskils.homeworks.hw_03032023.animal;

public class Main {
    public static void main(String[] args) {
        Feline cat = new Cat("Cat.jpg", "Meat", 1, new Animal.Boundaries(50, 50), new Animal.Location(7, 15));
        Feline tiger = new Tiger("Tiger.jpg", "Meat", 5, new Animal.Boundaries(500, 500), new Animal.Location(65, 278));
        Feline lion = new Lion("Lion.jpg", "Meat", 4, new Animal.Boundaries(700, 800), new Animal.Location(81, 754));
        Canine dog = new Dog("Dog.jpg", "Meat and chappy", 3, new Animal.Boundaries(250, 250), new Animal.Location(12, 145));
        Canine wolf = new Wolf("Wolf.jpg", "Meat", 9, new Animal.Boundaries(300, 300), new Animal.Location(248, 78));
        Animal hippo = new Hippo("Hippo.jpg", "Grass", 8, new Animal.Boundaries(1000, 1000), new Animal.Location(557, 897));

        Animal[] animals = {cat, tiger, lion, dog, wolf, hippo};
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            animal.roam();
            System.out.println("-------------------------------//------------------------------");
        }
        Feline[] felines = {cat, tiger, lion};
        for (Feline feline : felines) {
            feline.makeNoise();
            feline.eat();
            feline.sleep();
            feline.roam();
            System.out.println("_______________________________________________________________");
        }
        Canine[] canines = {dog, wolf};
        for (Canine canine : canines) {
            canine.makeNoise();
            canine.eat();
            canine.sleep();
            canine.roam();
            System.out.println("****************************************************************");
        }
    }
}
