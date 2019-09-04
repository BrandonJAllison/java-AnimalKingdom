package animals;

public class Birds extends Animals {
    public Birds(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "Flies";
    }

    @Override
    public String breathe() {
        return "Lungs";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}