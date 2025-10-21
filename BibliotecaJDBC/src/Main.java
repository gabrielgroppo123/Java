import java.sql.Connection;
import java.util.List;

public class Main {

    public static void testeDeConexao() {
        try (Connection conn = ConnectionFactory.getConnection()) {
            System.out.println("Conexão com banco de dados estabelecida com sucesso!");
        } catch (Exception e) {
            System.err.println("Falha ao conectar ao banco de dados.");
            //e.printStackTrace();
        }
    }

    public static void testeAdicionarLivro() {
        LivroDAO dao = new LivroDAO();

        Livro livro1 = new Livro("A Revolução dos Bichos", "George Dewell", 1945);
        dao.adicionarLivro(livro1);
    }

    public static void testeListarLivro() {
        LivroDAO dao = new LivroDAO();

        List<Livro> livros = dao.listarTodosLivros();

        System.out.println("----- Lista de Todos os Livros ----");
        for (Livro livro : livros) {
            System.out.println("ID: " + livro.getId() + ", Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() +
                    ", Ano: " + livro.getAnoPublicacao() + ", Disponível: " + livro.isDisponivel());
        }
    }

    public static void testeBuscarLivro() {
        LivroDAO dao = new LivroDAO();

//        Teste 1: Buscar livro existente
        System.out.println(" ---- Buscando livro ---- ");
        Livro livro1 = dao.buscarLivroPorTitulo("A Revolução dos Bichos");
        if (livro1 != null) {
            System.out.println("Livro encontrado!");
        } else {
            System.out.println("Livro NÃO encontrado.");
        }

        //        Teste 2: Buscar livro inexistente
        System.out.println(" ---- Buscando livro Don Quixote ---- ");
        Livro livro2 = dao.buscarLivroPorTitulo("Dom Quixote");
        if (livro2 != null) {
            System.out.println("Livro encontrado!");
        } else {
            System.out.println("Livro NÃO encontrado.");
        }
    }

    public static void main(String[] args) {
//        testeDeConexao();
//        testeAdicionarLivro();
//        testeListarLivro();
        testeBuscarLivro();
    }
}
