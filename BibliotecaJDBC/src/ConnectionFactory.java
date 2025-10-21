import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/biblioteca";
        String usuario = "root";
        String senha = "P@$$w0rd";

        try{
            return DriverManager.getConnection(url, usuario, senha);
        }
        catch (SQLException e){
            throw new RuntimeException("Erro ao conectar com o banco de dados", e);
        }
    }
}
