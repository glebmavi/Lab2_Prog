package Attacks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove {
    public Double_Team() {
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        Effect double_team_evasion = new Effect().chance(1).stat(Stat.EVASION, 1);
        pokemon.addEffect(double_team_evasion);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "used Double Team";
    }
}

