
import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main {

    public static void main(String[] args) {

        Battle b = new Battle();

        Munchlax p1 = new Munchlax("1", 22);
        Bouffalant p2 = new Bouffalant("2", 30);
        Snorlax p3 = new Snorlax("3", 38);
        Cosmoem p4 = new Cosmoem("4", 43);
        Solgaleo p5 = new Solgaleo("5", 53);
        Nigilego p6 = new Nigilego("6", 61);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }

}
