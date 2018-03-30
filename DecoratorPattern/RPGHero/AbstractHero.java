package DecoratorPattern.RPGHero;

public abstract class AbstractHero {

     String name;

     public abstract int getDefence();
     public abstract int getAttack();
     public abstract int getCapacity();

    public String getName() {
        return name;
    }

    public void printSkills() {
        System.out.println("ATTACK: " + getAttack());
        System.out.println("DEFENCE " + getDefence());
        System.out.println("CAPACITY " + getCapacity());
    }



}
