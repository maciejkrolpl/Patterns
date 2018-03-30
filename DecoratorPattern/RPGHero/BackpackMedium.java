package DecoratorPattern.RPGHero;

public class BackpackMedium extends AbstractItem {

    private static final int CAPACITY = 50;
    AbstractHero hero;

    public BackpackMedium(AbstractHero hero) {
        this.hero = hero;
    }

    @Override
    public int getDefence() {
        return hero.getDefence();
    }

    @Override
    public int getAttack() {
        return hero.getAttack();
    }

    @Override
    public int getCapacity() {
        return hero.getCapacity() + CAPACITY;
    }

    @Override
    public String getName() {
        return hero.getName() + "wears medium backpack (+" + CAPACITY + " to capacity) ";
    }
}
