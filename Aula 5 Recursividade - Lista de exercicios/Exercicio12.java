package Exerciciosrecursividade;

import java.util.Scanner;

public class Exercicio12 {
    public static int padovan(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        return padovan(n - 2) + padovan(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int N = sc.nextInt();
        System.out.println("P(" + N + ") = " + padovan(N));
    }
}
