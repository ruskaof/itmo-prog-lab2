package Moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger() { super(Type.NORMAL, 0, 85); }

    @Override
    protected void applyOppEffects (Pokemon p) { // confuses the target and raises theirs attack by 2 stages
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }

    @Override
    protected String describe () { return "использует Swagger"; }
}
