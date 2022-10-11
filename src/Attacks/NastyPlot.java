package Attacks;

import ru.ifmo.se.pokemon.*;

public class NastyPlot extends StatusMove {
    public NastyPlot(){
        super(Type.DARK, 0.00, 1.00);
    }


    @Override
    protected String describe() {
        return "uses Nasty PLot";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, 2);
    }
}
