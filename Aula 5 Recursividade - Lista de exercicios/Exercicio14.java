package Exerciciosrecursividade;

import java.util.Scanner;

public class Exercicio14 {
    public static String decimalParaBinario(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return decimalParaBinario(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero pra converter pra binário: ");
        int numero = sc.nextInt();
        String binario = decimalParaBinario(numero);
        System.out.println("O número " + numero + " em binário é: " + binario);
    }
}
