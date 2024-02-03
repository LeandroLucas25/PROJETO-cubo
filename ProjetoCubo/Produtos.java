package ProjetoCubo;

import java.util.Scanner;
public class Produtos extends Menu {

	 

    private String produtoEscolhido;

    protected void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("=============== Menu de Produtos =================");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("1. Dipirona monoidratada");
        System.out.println("2. Paracetamol");
        System.out.println("3. Dramin");
        System.out.println(" ");
        System.out.println("0. Voltar");
        System.out.println(" ");
        System.out.println("=================================================");
        
        
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                produtoEscolhido = "Dipirona monoidratada";
                break;
            case 2:
                produtoEscolhido = "Paracetamol";
                break;
            case 3:
                produtoEscolhido = "Dramin";
                break;
            case 0:
                System.out.println("Voltando ao menu principal...");
                return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                exibirMenu();
                return;
        }

        System.out.println("Você escolheu: " + produtoEscolhido);

        // Após exibir o produto escolhido, permite ao usuário escolher mais produtos ou voltar
        System.out.println(" ");
        System.out.println("1. Escolher mais produtos");
        System.out.println("0. Voltar");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            exibirMenu();
        } else {
            System.out.println("Voltando ao menu principal...");
        }
    }

	        
	    }



	
			
		

