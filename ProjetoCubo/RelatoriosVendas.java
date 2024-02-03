package ProjetoCubo;



import java.util.Scanner;

public class RelatoriosVendas extends Menu{

	

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
          	System.out.println(" "); 
            System.out.println("================ Relatório de Vendas ============");
        	System.out.println(" "); 
            System.out.println("1 - Dipirona - Quantidade vendida: 50 unidades, Valor total: R$ 100,00");
            System.out.println("2 - Paracetamol - Quantidade vendida: 30 unidades, Valor total: R$ 75,00");
            System.out.println("3 - Dramin - Quantidade vendida: 20 unidades, Valor total: R$ 50,00");
        	System.out.println(" "); 
            

            System.out.println("Digite 0 para voltar ao menu principal.");
         	System.out.println(" "); 
            System.out.println("=================================================");
            
            escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Voltando ao menu principal...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolha != 0);
    }
}