package Attacks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
    public Confide() {
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        Effect confide_s_a = new Effect().chance(1).stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.addEffect(confide_s_a);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "used Confide";
    }
}
