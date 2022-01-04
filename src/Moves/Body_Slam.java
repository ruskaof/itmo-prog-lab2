package Moves;

import ru.ifmo.se.pokemon.*;

public class Body_Slam extends PhysicalMove {

    public Body_Slam() { super(Type.NORMAL, 85, 100); }

    protected void applyOppEffects(Pokemon p) { // 30% chance of paralyzing the target
        if (Math.random() < 0.3) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() { return "использует Body Slam"; }
}
