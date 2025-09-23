package cenario;

public class Masmorra implements Cenario {
    private String nome;

    public Masmorra(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void explorar() {

    }
}
