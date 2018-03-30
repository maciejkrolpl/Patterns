package DecoratorPattern.RPGHero;

public class ShieldLight extends AbstractItem {

    private static final int DEFENCE = 30;
    AbstractHero hero;

    public ShieldLight(AbstractHero hero) {
        this.hero = hero;
    }

    @Override
    public int getDefence() {
        return hero.getDefence()+ DEFENCE;
    }

    @Override
    public int getAttack() {
        return hero.getAttack();
    }

    @Override
    public int getCapacity() {
        return hero.getCapacity();
    }

    @Override
    public String getName() {
        return hero.getName() + " wears light shield (+" + DEFENCE + " to defence) ";
    }
}
