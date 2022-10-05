package Pokemons;

import Attacks.PhysicalAttacks.Bite;
import Attacks.StatusAttacks.Rest;
import Attacks.StatusAttacks.Swagger;
import ru.ifmo.se.pokemon.*;

public class Nidorina extends NidoranF {
    public Nidorina(String name, int level) {
        super(name,level);
        setType(Type.POISON);
        setStats(70,62,67,55,55,56);
        setMove(new Rest(70), new Swagger(), new Bite());
    }

}