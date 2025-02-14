package animals;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animals> newAnimals = new ArrayList<Animals>();

        // set new animals
        newAnimals.add(new Mammals("Panda", 1869));
        newAnimals.add(new Mammals("Zebra", 1778));
        newAnimals.add(new Mammals("Koala", 1816));
        newAnimals.add(new Mammals("Sloth", 1804));
        newAnimals.add(new Mammals("Armidillo", 1758));
        newAnimals.add(new Mammals("Raccoon", 1758));
        newAnimals.add(new Mammals("Bigfoot", 2021));

        newAnimals.add(new Birds("Pigeon", 1837));
        newAnimals.add(new Birds("Peacock", 1821));
        newAnimals.add(new Birds("Toucan", 1758));
        newAnimals.add(new Birds("Parrot", 1824));
        newAnimals.add(new Birds("Swan", 1758));

        newAnimals.add(new Fish("Salmon", 1758));
        newAnimals.add(new Fish("Catfish", 1817));
        newAnimals.add(new Fish("Perch", 1758));

        // sort by discovery year
        System.out.println("\n*** Printing animals by discovery year ***");
        Collections.sort(newAnimals, (a1, a2) -> a1.yearDiscovered - a2.yearDiscovered);
        System.out.println(newAnimals);

        // sort alphabetically
        System.out.println("\n*** Printing animals alphabetically ***");
        Collections.sort(newAnimals, (a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        System.out.println(newAnimals);

        // sort animals by how they move
        System.out.println("\n*** Printing animals by how they move ***");
        Collections.sort(newAnimals, (a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        newAnimals.forEach(animal -> System.out.println(animal.getName() + ": " + animal.move()));

        // only animals that breathe with lungs
        System.out.println("\n*** Printing Animals that breathe with lungs");
        newAnimals.forEach(animal -> {
            if (animal.breathe().equals("Lungs")) {
                System.out.println(animal.getName() + ": " + animal.breathe());
            }
        });

        // only animals that breathe with lungs and discovered in 1758
        System.out.println("\n*** Printing Animals that breathe with lungs & named in 1758 ***");
        newAnimals.forEach(animal -> {
            if (animal.breathe().equals("Lungs") && animal.yearDiscovered == 1758) {
                System.out.println(animal.getName() + ": " + animal.breathe() + " " + animal.yearDiscovered);
            }
        });

        // only animals that lay eggs and breathe with lungs
        System.out.println("\n*** Printing Animals that lay eggs and breathe with lungs ***");
        newAnimals.forEach(animal -> {
            if (animal.reproduce().equals("Eggs") && animal.breathe().equals("Lungs")) {
                System.out.println(animal.getName() + ": " + "Breathes with " + animal.breathe() + " "
                        + "and reproduces by" + " " + animal.reproduce());
            }
        });

        // only animals in 1758 alphabetically
        System.out.println("\n*** Printing Animals that were named in 1758 alphabetically.");
        Collections.sort(newAnimals, (a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        newAnimals.forEach(animal -> {
            if (animal.yearDiscovered == 1758) {
                System.out.println(animal.getName() + ":" + animal.yearDiscovered);
                ;
            }
        });

        // only mammals alphabetically
        System.out.println("\n*** Printing Animals that are Mammals.");
        newAnimals.forEach(animal -> {
            if (animal instanceof Mammals) {
                System.out.println(animal);
            }
        });

    }

}