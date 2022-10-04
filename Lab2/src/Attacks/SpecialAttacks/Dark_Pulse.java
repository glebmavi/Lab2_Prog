package Attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class Dark_Pulse extends SpecialMove {
    public Dark_Pulse() {
        super(Type.DARK,80,1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        Effect dark_flinch = new Effect().chance(0.2);
        dark_flinch.flinch(pokemon);
        pokemon.addEffect(dark_flinch);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "used Dark Pulse";
    }
}