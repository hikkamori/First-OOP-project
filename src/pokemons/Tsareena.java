package pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tsareena extends Steenee {
    public Tsareena(String name, int lvl, int HP, int Attack, int Defense, int SpecialAttack, int SpecialDefense, int Speed) {
        super(name, lvl, HP, Attack, Defense, SpecialAttack, SpecialDefense, Speed);
        addMove(new Confide());

    }

}