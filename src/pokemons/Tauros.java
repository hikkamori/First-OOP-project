package pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tauros extends Pokemon {
    public Tauros(String name, int lvl, int HP, int Attack, int Defense, int SpecialAttack, int SpecialDefense, int Speed) {
        super(name, lvl);
        setStats(HP, Attack, Defense, SpecialAttack, SpecialDefense, Speed);
        setType(Type.NORMAL);
        setMove(new TakeDown(), new ZenHeadbutt(),new WorkUp(), new SmartStrike());

    }

}

