package Moves;

import ru.ifmo.se.pokemon.*;

public class Stone_Edge extends PhysicalMove{

    public Stone_Edge() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) { // increased chance of a critical hit
        if (Math.random() <= 1.0/8.0) {
            System.out.println("Критический урон от Stone Edge!");
            return 2.0;
        }
        return 1.0;
    }

    @Override
    protected String describe() {
        return "использует Stone Edge";
    }
}
