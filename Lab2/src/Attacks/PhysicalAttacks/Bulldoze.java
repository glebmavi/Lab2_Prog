package Attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND, 60, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        Effect bulldoze_speed = new Effect().chance(1).stat(Stat.SPEED, -1);
        pokemon.addEffect(bulldoze_speed);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "used Bulldoze";
    }
}
