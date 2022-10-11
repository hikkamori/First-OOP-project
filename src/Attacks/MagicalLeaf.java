package Attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class MagicalLeaf extends SpecialMove {
    public MagicalLeaf(){
        super(Type.GRASS, 60.00, 1.00);

    }

    @Override
    protected String describe() {
        return "hits with MagicalLeaf";
    }
}
