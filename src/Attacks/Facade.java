package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70.00, 1.00);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if(pokemon.getCondition() == Status.BURN || pokemon.getCondition() == Status.FREEZE || pokemon.getCondition() == Status.PARALYZE){
            this.power = 140;

        }
        else{
            this.power = 70;
        }

    }

    @Override
    protected String describe() {
        return "hits with Facade";
    }
}
