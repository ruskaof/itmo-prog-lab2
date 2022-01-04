package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Nigilego extends Pokemon {
    public Nigilego(String name, int level) {
        super(name, level);
        setStats(109, 53, 47, 127, 131, 103);
        setType(Type.ROCK, Type.POISON);

        addMove(new Swagger());
        addMove(new Double_Team());
        addMove((new Aerial_Ace()));
        addMove((new Charge_Beam()));;
    }
}
