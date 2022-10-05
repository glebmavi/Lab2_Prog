package Pokemons;

import Attacks.PhysicalAttacks.*;
import Attacks.StatusAttacks.*;
import ru.ifmo.se.pokemon.*;

public class Hippowdon extends Hippopotas {
    public Hippowdon(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(108, 112, 118, 68, 72, 47);
        addMove(new Fire_Fang());
    }

}
