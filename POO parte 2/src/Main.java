import entities.Guerreiro;
import entities.Inimigo;

public class Main {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Arnold, o bravo", 16, 12, 2);
        Inimigo i = new Inimigo("Goblin Caolho",5, 10 );
        EngineBatalha bc = new EngineBatalha();

        bc.lutar(g, i);
    }
}