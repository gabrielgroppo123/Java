import  java.util.Scanner;
public class Exercicio3 {

    public static int fibo(int n){
        if (n == 0 || n == 1){
            return n;
        }
        else {
            return n = fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o limite: ");
        int parada = sc.nextInt();
        int n1 = 0, n2 = 0;
        for (int n = 0; n <= parada ; n++) {
            System.out.println("Fibonacci: " + fibo(n));
        }
    }
}