import java.util.ArrayList;

public class arraylistex5 {
    public static void main(String[] args) {
        ArrayList<String> elementos = new ArrayList<>();

        elementos.add("Agua");
        elementos.add("Fogo");
        elementos.add("Terra");
        elementos.add("Ar");

        for(String item : elementos){
            System.out.println(item);
        }

        elementos.clear();

        System.out.println("Depois: " + elementos);
    }
}
