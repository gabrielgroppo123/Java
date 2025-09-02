public class Exercicio7 {
    public static int menorelemrec(int[] vetor, int n){
        if (n == 1){
            return vetor[0];
        }
        int menorelem = menorelemrec(vetor, n-1);

        if (menorelem < vetor[n-1]){
            return menorelem;
        }
        else{
            return  vetor[n-1];
        }
    }
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5, 6};
        System.out.println(menorelemrec(vetor1, vetor1.length));
    }
}
