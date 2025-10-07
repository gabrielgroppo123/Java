import java.util.Objects;

public class Produto {
    private int id;
    private String nome;

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Produto produto = (Produto) obj;
        if (this.id == produto.id){
        return true;
        }
        else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
