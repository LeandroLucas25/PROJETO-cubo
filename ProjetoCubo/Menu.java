package ProjetoCubo;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    new Produtos().exibirMenu();
                    break;
                case 2:
                    new Clientes().exibirMenu();
                    break;
                case 3:
                    new RelatoriosVendas().exibirMenu();
                    break;
                case 4:
                    new Fornecedores().exibirMenu();
                    break;
                case 5:
                    new Vendedores().exibirMenu();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("============== Menu da Farmácia ============");
        System.out.println(" ");
        System.out.println("1. Produtos");
        System.out.println("2. Clientes");
        System.out.println("3. Relatórios de Vendas");
        System.out.println("4. Fornecedores");
        System.out.println("5. Vendedores");
        System.out.println(" ");
        System.out.println("0. Sair");
        System.out.println(" ");
        System.out.println("=============================================");
    }

			
}
