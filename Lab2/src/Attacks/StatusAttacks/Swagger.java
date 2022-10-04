package Attacks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.PSYCHIC, 0, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        Effect swagger = new Effect().stat(Stat.ATTACK, 2);
        swagger.confuse(pokemon);
        pokemon.addEffect(swagger);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "used Swagger";
    }
}
