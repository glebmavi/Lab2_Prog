package Attacks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    private int Total_HP;
    public Rest(int HP) {
        super(Type.PSYCHIC,0,1);
        this.Total_HP = HP;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        Effect rest_sleep = new Effect().chance(1).turns(2).stat(Stat.HP, Total_HP);
        rest_sleep.sleep(pokemon);
        pokemon.addEffect(rest_sleep);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "used Rest";
    }
}