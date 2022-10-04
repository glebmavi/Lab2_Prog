package Pokemons;

import Attacks.SpecialAttacks.*;
import Attacks.StatusAttacks.*;
import ru.ifmo.se.pokemon.*;

public class Yveltal extends Pokemon {
    public Yveltal(String name, int level) {
        super(name,level);
        setType(Type.DARK,Type.FLYING);
        setStats(126,131,95,131,98,99);
        setMove(new Psychic(),new Dark_Pulse(), new Hurricane(), new Rest());
    }

}