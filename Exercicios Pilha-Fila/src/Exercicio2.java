import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        boolean sair = false;

        while (!sair) {
            System.out.println("\nMenu:");
            System.out.println("1 – Cadastrar número");
            System.out.println("2 – Mostrar números pares");
            System.out.println("3 – Excluir número");
            System.out.println("4 – Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite números para cadastrar (digite uma letra para parar):");
                    while (true) {
                        System.out.print("Número: ");
                        String entrada = scanner.nextLine();
                        try {
                            int num = Integer.parseInt(entrada);
                            pilha.push(num);
                        } catch (NumberFormatException e) {
                            System.out.println("Parando cadastro.");
                            break; // sai do loop de cadastro ao digitar uma letra
                        }
                    }
                    break;

                case "2":
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia. Nada para mostrar.");
                    } else {
                        System.out.println("Números pares cadastrados:");
                        boolean temPar = false;
                        for (int num : pilha) {
                            if (num % 2 == 0) {
                                System.out.println(num);
                                temPar = true;
                            }
                        }
                        if (!temPar) {
                            System.out.println("Nenhum número par encontrado.");
                        }
                    }
                    break;

                case "3":
                    if (pilha.isEmpty()) {
                        System.out.println("Pilha vazia! Nada para excluir.");
                    } else {
                        int removido = pilha.pop();
                        System.out.println("Número removido: " + removido);
                    }
                    break;

                case "4":
                    System.out.println("Saindo...");
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
