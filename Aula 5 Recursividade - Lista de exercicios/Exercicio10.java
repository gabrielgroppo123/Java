package Exerciciosrecursividade;

import java.util.Scanner;

public class Exercicio10 {

    public static long fatorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return  n * fatorial(n-1);
    }

    public static long superfatorial(int n){
        if (n == 1) {
            return 1;
        }
        return superfatorial(n-1) * fatorial(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero = sc.nextInt();
        long resultado = superfatorial(numero);
        System.out.println("Superfatorial de " + numero + " é: " + resultado);
    }
}
