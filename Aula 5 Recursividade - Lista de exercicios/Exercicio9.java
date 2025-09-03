import java.util.Scanner;

public class Exercicio9 {


    public static long fatorialDuplo(int n) {
        if (n % 2 == 0 || n <= 0) {

            System.out.println("O número deve ser positivo e ímpar.");
            return -1;
        }

        if (n == 1) {
            return 1;
        }

        return n * fatorialDuplo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para fazer o fatorial duplo: ");
        int n = sc.nextInt();
        long resultado = fatorialDuplo(n);
        if (resultado != -1) {
            System.out.println(n + "!! = " + resultado);
        }
    }
}
