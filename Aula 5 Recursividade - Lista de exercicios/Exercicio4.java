import  java.util.Scanner;

public class Exercicio4 {

    public static int mr(int n1, int n2 ){
        if (n1 == 0 || n2== 0){
            System.out.print("0");
            return 0;
        }
        System.out.print(n1+" + ");
        return n1 + mr(n1,n2-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro fator da multiplicação: ");
        int fator1 = sc.nextInt();
        System.out.print("Digite o segundo fator da multiplicação: ");
        int fator2 = sc.nextInt();

        System.out.print(" = " + mr(fator1,fator2));

    }
}
