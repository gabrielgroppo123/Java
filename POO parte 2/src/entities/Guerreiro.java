package entities;
import java.util.Random;


public class Guerreiro extends Personagem {
    private Random random = new Random();
    public Guerreiro(String nome, int forca, int destreza, int inteligencia) {
        super(nome, forca, destreza, inteligencia);
    }

    @Override
    public int rolarParaAcertar() {

        return random.nextInt(1, 21) + getModificadorAtributo(getForca());
    }

    @Override
    public int rolarDano() {
        return random.nextInt(1, 9) + getModificadorAtributo(getForca());
    }

    @Override
    public void receberDano(int dano) {
        setHp(getHp() - dano);
    }
}
