package animals;

import java.utils.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> newAnimals = new ArrayList<Animal>();

        newAnimals.add(newMammals("Panda", 1869));
        newAnimals.add(newMammals("Zebra", 1778));
        newAnimals.add(newMammals("Koala", 1816));
        newAnimals.add(newMammals("Sloth", 1804));
        newAnimals.add(newMammals("Armidillo", 1758));
        newAnimals.add(newMammals("Raccoon", 1758));
        newAnimals.add(newMammals("Bigfoot", 2021));

        newAnimals.add(newBirds("Pigeon", 1837));
        newAnimals.add(newBirds("Peacock", 1821));
        newAnimals.add(newBirds("Toucan", 1758));
        newAnimals.add(newBirds("Parrot", 1824));
        newAnimals.add(newBirds("Swan", 1758));

        newAnimals.add(newFish("Salmon", 1758));
        newAnimals.add(newFish("Catfish", 1817));
        newAnimals.add(newFish("Perch", 1758));

    }
}