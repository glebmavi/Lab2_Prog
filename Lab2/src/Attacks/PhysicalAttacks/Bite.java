package Attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Bite extends PhysicalMove {
    public Bite() {
        super(Type.DARK, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        Effect bite_flinch = new Effect().chance(0.3);
        bite_flinch.flinch(pokemon);
        pokemon.addEffect(bite_flinch);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "used Bite";
    }
}
