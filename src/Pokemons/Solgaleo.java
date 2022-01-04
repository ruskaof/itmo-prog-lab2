package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Solgaleo extends Cosmoem {
    public Solgaleo(String name, int level) {
        super(name, level);
        setStats(137, 137, 107, 113, 89, 97);
        setType(Type.PSYCHIC, Type.STEEL);

        addMove(new Aerial_Ace());
    }
}
