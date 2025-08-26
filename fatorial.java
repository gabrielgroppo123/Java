import java.util.Scanner;

public class fatorial {
    public static int fatorial (int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return  n * fatorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println("Fatorial("+i+") = "+i+"! = " + fatorial(i));
        }
    }
}