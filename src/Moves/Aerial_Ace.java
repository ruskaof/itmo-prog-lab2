package Moves;

import ru.ifmo.se.pokemon.*;

public class Aerial_Ace extends PhysicalMove {
    public Aerial_Ace() { super(Type.FLYING, 60, 0); } // has 100% chance to hit

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe() { return "использует Aerial Ace"; }
}
