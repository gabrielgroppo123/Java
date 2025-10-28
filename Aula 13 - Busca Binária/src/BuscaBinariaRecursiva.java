public class BuscaBinariaRecursiva {

  public static int buscaBinaria(int [] a, int inicio, int fim, int x){

    if(inicio > fim){
      return -1;
    }

      int meio = (fim + inicio)/2;

      if (x == a[meio]){
        return meio;
      }
      else if (x > a[meio]){
        return buscaBinaria(a, meio + 1, fim, 20);
      }
      else {
        return buscaBinaria(a, inicio, meio -1, 20);
      }
  }

  public static void main(String[] args) {
    int[] a = {1, 5, 10, 15, 20, 25};
    System.out.println(buscaBinaria(a, 0, 5, 20));
  }
}