import pokemons.*;
import ru.ifmo.se.pokemon.*;
import java.util.List;


public class Lab {
    public static void main(String[] args) {
        Battle b = new Battle();
        Meowth meowthh = new Meowth(null, -33441, -39900, 45, 35, 40, 40, 90);
        Steenee steenya = new Steenee("Steee", 1, -300, 40, 48, 40, 48, 62);
        Bounsweet bounsweety = new Bounsweet("bounsweety", 841, -300,30,38,30,38,32);
        Persian  persy = new Persian("persy", 1, -400,70,60,65,65,115);
        Tsareena tsareena = new Tsareena("Tsareewna", 164,-300,120,98,50,98,72);
        Tauros tauros = new Tauros("tauross", 1, -900,100,95,40,70,110);
        b.addAlly(steenya);
        b.addAlly(meowthh);
        b.addAlly(bounsweety);
        b.addFoe(persy);
        b.addFoe(tsareena);
        b.addFoe(tauros);
        b.go();
    }
}

