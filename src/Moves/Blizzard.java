package Moves;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {

    public Blizzard() { super (Type.ICE, 110, 70); }

    @Override
    protected void applyOppEffects(Pokemon p) { // 10% chance of freezing the target
        if (Math.random() <= 0.1) {
            Effect.freeze(p);
        }
    }

    @Override
    protected String describe() { return "использует Blizzard"; }
}
