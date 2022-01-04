package Moves;

import ru.ifmo.se.pokemon.*;

public class Charge_Beam extends SpecialMove {
    public Charge_Beam() { super(Type.ELECTRIC, 50, 90); }

    @Override
    protected void applySelfEffects(Pokemon p) { // has 70% chance of raising the user's attack by one stage
        if (Math.random() <= 0.7) {
            p.setMod(Stat.ATTACK, 1);
        }
    }

    @Override
    protected String describe() { return "использует Charge Beam"; }
}
