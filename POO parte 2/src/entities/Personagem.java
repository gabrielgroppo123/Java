package entities;

public abstract class Personagem implements Combatente {
    private String nome;
    private int forca, destreza, inteligencia, nivel, maxHp, hp, maxMp, mp, ac, ouro;

    public Personagem(String nome, int forca, int destreza, int inteligencia) {
        this.nome = nome;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.nivel = 1;
        this.ouro = 100;
        calcularAtributosDerivados();
    }

    private void calcularAtributosDerivados(){
        this.maxHp = 10 + getModificadorAtributo(forca);
        this.hp = maxHp;
        this.maxMp = 10 + getModificadorAtributo(inteligencia);
        this.mp = maxMp;
        this.ac = 10 + getModificadorAtributo(destreza);
    }
    public int getModificadorAtributo(int atributo){
        return (atributo -10)/2;
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
    public int getAc(){
        return ac;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }
}