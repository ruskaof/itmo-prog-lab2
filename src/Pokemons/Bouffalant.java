package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Bouffalant extends Pokemon {
    public Bouffalant(String name, int level) {
        super(name, level);
        setStats(95, 110, 95, 30, 95, 55);
        setType(Type.NORMAL);

        addMove(new Stone_Edge());
        addMove(new Leer());
        addMove(new Rock_Tomb());
        addMove(new Facade());
    }
}
