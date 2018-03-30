package DecoratorPattern.RPGHero;

public class BackpackLight extends AbstractItem {

    private static final int CAPACITY = 20;
    AbstractHero hero;

    public BackpackLight(AbstractHero hero) {
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
        return hero.getName() + "wears light backpack (+" + CAPACITY + " to capacity) ";
    }
}
