package DecoratorPattern.RPGHero;

public class Elf extends AbstractHero {

    private final int DEFENCE = 30;
    private final int ATTACK = 60;
    private final int CAPACITY = 50;

    public Elf() {
        name = "Elf";
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
