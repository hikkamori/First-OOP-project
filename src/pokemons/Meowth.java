package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Attacks.*;


public class Meowth extends Pokemon{
    public Meowth(String name, int lvl, int HP, int Attack, int Defense, int SpecialAttack, int SpecialDefense, int Speed) {
            super(name, lvl);
            setStats(HP, Attack, Defense, SpecialAttack, SpecialDefense, Speed);
            setType(Type.NORMAL);
            setMove(new AerialAce(), new Thunder(), new NastyPlot());

        }

    }

