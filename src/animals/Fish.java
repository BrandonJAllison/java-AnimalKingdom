package animals;

public class Fish extends Animals {

    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "Swim";
    }

    @Override
    public String breathe() {
        return "Gills";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}