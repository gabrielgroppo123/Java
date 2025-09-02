import java.util.Scanner;

public class Exercicio6 {
    public static void imprimirNumeros(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n+ " ");
        imprimirNumeros(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int N = sc.nextInt();

        imprimirNumeros(N);
    }
}