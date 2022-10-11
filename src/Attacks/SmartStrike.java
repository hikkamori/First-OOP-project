package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SmartStrike extends PhysicalMove {

    public SmartStrike(){
        super(Type.STEEL, 70.00, 1.00);
    }

    @Override
    protected String describe() {
        return "hits with Smart Strike";
    }
}

