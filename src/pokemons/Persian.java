package pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Persian extends Meowth {
    public Persian(String name, int lvl, int HP, int Attack, int Defense, int SpecialAttack, int SpecialDefense, int Speed) {
        super(name, lvl, HP, Attack, Defense, SpecialAttack, SpecialDefense, Speed);
        addMove(new Swift());

    }

}
