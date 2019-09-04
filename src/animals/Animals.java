package animals;

public abstract class Animals {
    private static int baseId = 0;
    public int id;
    public String name;
    public int yearDiscovered;

    public Animals(String name, int yearDiscovered) {
        id = baseId++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;

    }

    public String getName() {
        return name;
    }

    public String move() {
        return "Moves";
    }

    public String breathe() {
        return "Breathes";
    }

    public String reproduce() {
        return "Reproduces";
    }

    @Override
    public String toString() {
        return "\nAnimal Name: " + name + "\n" + "Year Discovered: " + yearDiscovered;
    }

}