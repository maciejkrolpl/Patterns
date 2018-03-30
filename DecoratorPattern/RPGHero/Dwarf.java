package DecoratorPattern.RPGHero;

public class Dwarf extends AbstractHero {

    private final int DEFENCE = 50;
    private final int ATTACK = 20;
    private final int CAPACITY = 40;

    public Dwarf() {
        name = "Dwarf";
    }


    @Override
    public int getDefence() {
        return DEFENCE;
    }

    @Override
    public int getAttack() {
        return ATTACK;
    }

    @Override
    public int getCapacity() {
        return CAPACITY;
    }
}
