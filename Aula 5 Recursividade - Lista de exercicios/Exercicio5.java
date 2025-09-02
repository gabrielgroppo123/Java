import java.util.Scanner;

public class Exercicio5 {
    public static void imprimirNumeros(int n) {
        if (n < 0) {
            return;
        }
        imprimirNumeros(n - 1);
        System.out.print(n+ " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int N = sc.nextInt();

        imprimirNumeros(N);
    }
}

