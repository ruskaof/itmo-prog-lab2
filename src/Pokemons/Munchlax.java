package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Munchlax extends Pokemon{
    public Munchlax(String name, int level) {
        super(name, level);
        setStats(135, 85, 40, 40, 85, 5);
        setType(Type.NORMAL);

        addMove(new Blizzard());
        addMove(new Body_Slam());
        addMove(new Double_Team());
    }

}
