import java.util.Scanner;
public class Exercicio2 {

    public static int cubo(int num, int exp){

        if (exp == 0){
            return 1;
        }
        else {
            return (int)Math.pow(num,exp);
        }

    }

    public static int somacubo (int n){
        if (n==0){
            return  0;
        }
        else {
            return (cubo(n,3)) + somacubo(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero = sc.nextInt();

        for (int n = 1; n <= numero ; n++) {
            System.out.println("Soma ("+n+"³) =  " + somacubo(n));
        }
    }
}