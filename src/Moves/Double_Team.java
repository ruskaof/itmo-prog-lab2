package Moves;

import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove{

    public Double_Team() { super(Type.NORMAL, 0, 0); }

    @Override
    protected void applySelfEffects(Pokemon p) { // raises user's Evasiveness by one stage
        p.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe () { return "использует Double Team"; }
}
