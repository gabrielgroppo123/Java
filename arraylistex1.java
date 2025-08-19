import java.util.ArrayList;
import java.util.Scanner;
public class arraylistex1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Maria");

        for (String item : nomes){
            System.out.println(item);
        }

        nomes.remove("João");
        System.out.println();
        for (String item : nomes){
            System.out.println(item);
        }
    }
}
