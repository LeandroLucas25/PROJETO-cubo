package ProjetoCubo;
import java.util.Scanner;
public class Fornecedores extends  Menu{
	 public void exibirMenu() {
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {  
	        	System.out.println(" ");
	            System.out.println("===== Menu de visualização dos Fornecedores =====");
	            System.out.println(" ");
	            System.out.println("1 - Neo Química");
	            System.out.println("2 - Cimed");
	            System.out.println("3 - EMS");
	            System.out.println("4 - Eurofarma");
	            System.out.println(" ");
	            System.out.println("0. Voltar");

	            System.out.println("  ");
	            System.out.println("====================================================");
	            System.out.println("Escolha uma opção: ");
	           
	            opcao = scanner.nextInt();

	            if (opcao == 0) {      System.out.println(" ");
	                System.out.println("Voltando ao menu principal...");
	            } else {
	                System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (opcao != 0);
	    }
	}