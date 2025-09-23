package entities;

import java.util.Random;

public class Inimigo implements Combatente {
    private String nome;
    private int hp, ac;
    private Random random = new Random();
    public Inimigo(String nome, int hp, int ac) {
        this.nome = nome;
        this.hp = hp;
        this.ac = ac;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int rolarParaAcertar() {
        return random.nextInt(1, 21);
    }

    @Override
    public int rolarDano() {
        return random.nextInt(1, 5);
    }

    @Override
    public int getAc() {
        return ac;
    }

    @Override
    public boolean getVivo() {
        if(hp > 0){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void receberDano(int dano) {

    }
}
