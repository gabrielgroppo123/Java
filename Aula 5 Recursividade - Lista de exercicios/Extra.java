import java.util.Scanner;

public class Extra {

    public static int cubo(int num, int exp){

        if (exp == 0){
            return 1;
        }
        else {
            return (int)Math.pow(num,exp);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero = sc.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();


        int resultado = cubo(numero,expoente);
        System.out.println("Resultado: " + resultado);

    }
}
