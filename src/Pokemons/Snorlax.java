package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Snorlax extends Munchlax{
    public Snorlax(String name, int level) {
        super(name, level);
        setStats(160, 110, 65, 65, 110, 30);
        setType(Type.NORMAL);

        addMove(new Pound());
    }
}
