package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Cosmoem extends Pokemon{
    public Cosmoem (String name, int level) {
        super(name, level);
        setStats(43, 29, 131, 29, 131, 37);
        setType(Type.PSYCHIC);
        addMove(new Swagger());
        addMove(new Double_Team());
    }

}
