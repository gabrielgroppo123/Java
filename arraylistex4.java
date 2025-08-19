import java.lang.reflect.Array;
import java.util.ArrayList;

public class arraylistex4 {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();

        palavras.add("Blablabla");
        palavras.add("Blebleble");
        palavras.add("Blublublu");


        for (String item : palavras){
            System.out.println(item);
        }
        int tamanho = palavras.size();

        System.out.println(tamanho);
    }
}
