package Moves;
import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove{
    public Leer() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) { // lowers the target's defence by 1 stage
        p.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe() { return "использует Leer"; }
}
