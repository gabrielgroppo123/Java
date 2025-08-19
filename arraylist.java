import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main (String[]args){

        String[] nomes = {"Ana", "Bruno", "Carlos"};

        List<String> listaNomes  = new ArrayList<>(Arrays.asList("Ana", "Joao", "Zé"));

        listaNomes = Arrays.asList(nomes);

        Collections.sort(listaNomes);

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Maçã");
        lista.add("Banana");

        for (String item : lista){
            System.out.println(item);
        }

        int tam = lista.size();

        System.out.println(tam);

        boolean existe = lista.contains("Maçã");

        System.out.println(existe);

        String[] array = lista.toArray(new String[0]);

        for (String i : array){
            System.out.println(i);
        }

    }
}