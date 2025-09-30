import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio1 {
    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> fila = new LinkedList<>();

        pilha.add(1);
        pilha.add(2);
        pilha.add(3);
        pilha.add(4);
        pilha.add(5);

        fila.add(6);
        fila.add(7);
        fila.add(8);
        fila.add(9);
        fila.add(1);

        for(Integer nump : pilha){
            for(Integer numf : fila){
                if (nump.equals(numf)){
                    System.out.println(nump + " ");
                }
            }
        }
        System.out.println("Pilha: " + pilha);
        System.out.println("Fila: " + fila);
    }
}