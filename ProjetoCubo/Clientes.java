package ProjetoCubo;

import java.util.Scanner;

public class Clientes extends  Menu{
    private String clienteEscolhido;


    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
    	System.out.println(" ");    
        System.out.println("================= Menu de Clientes ==============");
   
    	System.out.println(" ");  
        System.out.println("1. José Roberto");
        System.out.println("2. Robson Carlos");
        System.out.println("3. Cleiton Colins");
    	System.out.println(" ");
        System.out.println("0. Voltar");
    	System.out.println(" ");
        System.out.println("=================================================");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                clienteEscolhido = "José Roberto";
                break;
            case 2:
                clienteEscolhido = "Robson Carlos";
                break;
            case 3:
                clienteEscolhido = "Cleiton Colins";
                break;
            case 0:
                System.out.println("Voltando ao menu principal...");
                return; 
            default:
                System.out.println("Opção inválida. Tente novamente.");
                exibirMenu();
                return;
        }

        System.out.println("Você escolheu o cliente: " + clienteEscolhido);

    
        System.out.println(" ");
        System.out.println("1. Escolher mais clientes");
        System.out.println("0. Voltar");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            exibirMenu();
        } else {
            System.out.println("Voltando ao menu principal...");
        }
    }
}

