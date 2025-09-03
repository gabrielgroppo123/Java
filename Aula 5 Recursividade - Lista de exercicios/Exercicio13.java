import  java.util.Scanner;
public class Exercicio13 {

    public static int pell(int n){
        if (n == 0 || n == 1){
            return n;
        }
        else {
            return n = 2*pell(n-1) + pell(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o limite: ");
        int parada = sc.nextInt();
        for (int n = 0; n <= parada ; n++) {
            System.out.println("Pell("+n+"): " + pell(n));
        }
    }
}