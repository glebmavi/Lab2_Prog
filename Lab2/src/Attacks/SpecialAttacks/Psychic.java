package Attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic() {
        super(Type.PSYCHIC,90,0.5);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect psy_low_def = new Effect().turns(1).chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(psy_low_def);
        super.applyOppEffects(pokemon);
    }
    @Override
    protected String describe() {
        return "used Psychic";
    }
}
