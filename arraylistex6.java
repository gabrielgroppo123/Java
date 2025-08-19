import java.util.ArrayList;
import java.util.Arrays;

public class arraylistex6 {
    public static void main(String[] args) {
        ArrayList<String> origem = new ArrayList<>();
        ArrayList<String> destino = new ArrayList<>();

        origem.add("Rua 1");
        origem.add("Rua 2");
        origem.add("Rua 3");
        origem.add("Rua 4");

        destino.addAll(origem);

        System.out.println("Destino: " + destino);

    }
}
