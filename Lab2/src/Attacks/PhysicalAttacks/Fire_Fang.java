package Attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Fire_Fang extends PhysicalMove {
    public Fire_Fang() {
        super(Type.FIRE, 65, 0.95);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        Effect fire_fang = new Effect().chance(0.1).condition(Status.BURN);
        fire_fang.flinch(pokemon);
        pokemon.addEffect(fire_fang);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "used Fire Fang";
    }
}
