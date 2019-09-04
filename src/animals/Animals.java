package animals;

public abstract class Animal {
    private static int baseId = 0;
    public int id;
    private String name;
    private int yearDiscovered;

    public Animal(String name, int yearDiscovered) {
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

}