package Moves;

import ru.ifmo.se.pokemon.*;

public class Rock_Tomb extends PhysicalMove {
    public Rock_Tomb() {
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) { // lower target's speed by 1 stage
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "использует Rock Tomb";
    }
}
