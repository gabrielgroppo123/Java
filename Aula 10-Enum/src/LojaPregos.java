import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class LojaPregos {

    public static void main(String[] args) {
        Map<String, Integer> estoque = new LinkedHashMap<>(); // Para manter ordem
        estoque.put("Pregos", 3000);
        estoque.put("Porcas", 2000);
        estoque.put("Parafusos", 1000);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Estoque Atual ---");

            // Mostrar só produtos com estoque > 0 e numerar dinamicamente
            Map<Integer, String> opcoesValidas = new HashMap<>();
            int numeroOpcao = 1;
            for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
                if (entry.getValue() > 0) {
                    System.out.println(numeroOpcao + " - " + entry.getKey() + ": " + entry.getValue());
                    opcoesValidas.put(numeroOpcao, entry.getKey());
                    numeroOpcao++;
                }
            }
            System.out.println("0 - Sair");

            if (opcoesValidas.isEmpty()) {
                System.out.println("Estoque esgotado! Não há produtos para vender.");
                break;
            }

            System.out.print("Escolha o produto pelo número: ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Encerrando sistema.");
                break;
            }

            if (!opcoesValidas.containsKey(escolha)) {
                System.out.println("Opção inválida ou produto sem estoque. Tente novamente.");
                continue;
            }

            String produto = opcoesValidas.get(escolha);

            System.out.print("Digite a quantidade para vender de " + produto + ": ");
            int quantidade = scanner.nextInt();

            int estoqueAtual = estoque.get(produto);

            if (quantidade > estoqueAtual) {
                System.out.println("Estoque insuficiente! Tente uma quantidade menor.");
            } else {
                estoque.put(produto, estoqueAtual - quantidade);
                System.out.println("Venda realizada! Estoque atualizado de " + produto + ": " + estoque.get(produto));
            }
        }
        scanner.close();
    }
}
