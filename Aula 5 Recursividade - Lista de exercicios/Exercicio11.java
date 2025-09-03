package Exerciciosrecursividade;

import java.util.Scanner;

public class Exercicio11 {

    public static int sequencia(int n){

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return 2 * sequencia(n - 1) + 3 * sequencia(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        System.out.println("F(" + num + ") = " + sequencia(num));
    }
}
