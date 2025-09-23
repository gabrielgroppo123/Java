package entities;

public interface Combatente {
    public abstract int rolarParaAcertar();
    public abstract int rolarDano();
    public abstract int getAc();
    public abstract boolean getVivo();
    public abstract String getNome();
    public abstract void receberDano(int dano);
}
