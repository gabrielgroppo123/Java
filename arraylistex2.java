import java.util.ArrayList;

public class arraylistex2 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);


        for(int i : numeros){
            System.out.println(i);
        }

        boolean existe = numeros.contains(3);
        System.out.println(existe);
    }
}
