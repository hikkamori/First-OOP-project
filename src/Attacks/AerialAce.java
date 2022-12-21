package Attacks;

import org.w3c.dom.ls.LSOutput;
import ru.ifmo.se.pokemon.Messages;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.*;

import java.util.ResourceBundle;


// тип сила точность

public class AerialAce extends PhysicalMove {
        public AerialAce(){
            super(Type.FLYING, 60.00, 1.00);
        }

    @Override
    protected String describe() {
        return "hits with Aerial Attacks!";
    }
}


