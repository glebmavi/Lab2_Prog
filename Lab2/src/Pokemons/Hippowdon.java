package Pokemons;

import Attacks.PhysicalAttacks.*;
import Attacks.StatusAttacks.*;
import ru.ifmo.se.pokemon.*;

public class Hippowdon extends Pokemon {
    public Hippowdon(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(108, 112, 118, 68, 72, 47);
        setMove(new Double_Team(), new Bulldoze(), new Confide(), new Fire_Fang());
    }

}
