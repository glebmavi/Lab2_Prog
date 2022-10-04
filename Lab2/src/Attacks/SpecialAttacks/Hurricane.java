package Attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class Hurricane extends SpecialMove {
    public Hurricane() {
        super(Type.FLYING,110,0.7);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        Effect hurricane_confuse = new Effect().chance(0.3);
        hurricane_confuse.confuse(pokemon);
        pokemon.addEffect(hurricane_confuse);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "used Hurricane";
    }
}