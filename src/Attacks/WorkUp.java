package Attacks;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp() {
        super(Type.NORMAL, 0.00, 1.00);

    }

    @Override
    protected String describe() {
        return "uses Work Up";
    }


    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 1);
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
    }
}

