import java.util.Scanner;
public class soma {

    public static int soma (int n){
        if (n==0){
            return  0;
        }
        else {
            return n + soma(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero = sc.nextInt();

        for (int n = 1; n <= numero ; n++) {
            System.out.println("Soma ("+n+") =  " + soma(n));
        }
    }
}
