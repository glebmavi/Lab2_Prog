package Pokemons;

import Attacks.PhysicalAttacks.Bite;
import Attacks.StatusAttacks.Double_Team;
import Attacks.StatusAttacks.Rest;
import Attacks.StatusAttacks.Swagger;
import ru.ifmo.se.pokemon.*;
public class Nidoqueen extends Nidorina {
    public Nidoqueen(String name, int level) {
        super(name,level);
        setType(Type.POISON,Type.GROUND);
        setStats(90,92,87,75,85,76);
        setMove(new Rest(90), new Swagger(), new Bite(), new Double_Team());
    }

}