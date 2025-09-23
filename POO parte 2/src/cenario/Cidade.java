package cenario;

public class Cidade implements Cenario {
    private String nome;

    public Cidade(String nome) {
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
