import java.util.ArrayList;

public class arraylistex3 {
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<>();

        idades.add(15);
        idades.add(20);
        idades.add(25);
        idades.add(30);
        idades.add(150);

        for(int item : idades){
            System.out.println(item);
        }
    }
}
