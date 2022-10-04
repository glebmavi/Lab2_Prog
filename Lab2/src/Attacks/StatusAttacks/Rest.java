package Attacks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC,0,1);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        Effect rest_sleep = new Effect().chance(1).turns(2).stat(Stat.HP, (int) pokemon.getHP());
        rest_sleep.sleep(pokemon);
        pokemon.addEffect(rest_sleep);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "used Rest";
    }
}