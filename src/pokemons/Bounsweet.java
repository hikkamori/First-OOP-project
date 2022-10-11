package pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bounsweet extends Pokemon {
    public Bounsweet(String name, int lvl, int HP, int Attack, int Defense, int SpecialAttack, int SpecialDefense, int Speed) {
        super(name, lvl);
        setStats(HP, Attack, Defense, SpecialAttack, SpecialDefense, Speed);
        setType(Type.GRASS);
        setMove(new MagicalLeaf(), new Facade());

    }

}
