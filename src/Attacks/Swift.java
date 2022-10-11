package Attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Swift extends SpecialMove {
    public Swift(){
        super(Type.NORMAL, 60.00, 1.00);
    }

    @Override
    protected String describe() {
        return "hits with Swift";
    }
}
