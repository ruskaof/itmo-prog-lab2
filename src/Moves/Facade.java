package Moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon var1, Pokemon var2) { // if the user is burned, poisoned or paralyzed deal damage with double power
        Status c = var1.getCondition();
        int d = 1; // power multiplier
        if (c.equals(Status.BURN) || c.equals(Status.POISON) || c.equals(Status.PARALYZE)) {
            d = 2;
        }
        return (0.4D * (double) var1.getLevel() + 2.0D) * this.power * d / 150.0D;
    }

    @Override
    protected String describe() { return "использует Facade"; }
}
