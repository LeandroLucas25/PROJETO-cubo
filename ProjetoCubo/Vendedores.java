package ProjetoCubo;
import java.util.Scanner;

public class Vendedores extends Menu{
public void exibirMenu() {
	  Scanner scanner = new Scanner(System.in);
      int opcao;

      do {
          System.out.println("=============== Menu de Vendedores  ============");
          System.out.println(" ");
          System.out.println("1. Ricardo Alberto");
          System.out.println("2. Daniel Carlos");
          System.out.println("3. Patricia Alcantara");
          System.out.println(" ");
          System.out.println("0. Voltar");
          System.out.println(" ");
          System.out.println("=================================================");

          System.out.print("Escolha uma opção: ");
          opcao = scanner.nextInt();

          switch (opcao) {
              case 1:
                  System.out.println("Você escolheu Ricardo Alberto");
                  break;
              case 2:
                  System.out.println("Você escolheu Daniel Carlos");
                  break;
              case 3:
                  System.out.println("Você escolheu Patricia Alcantara");
                  break;
              case 0:
                  System.out.println("Voltando ao menu principal...");
                  break;
              default:
                  System.out.println("Opção inválida. Tente novamente.");
                  break;
          }

      } while (opcao != 0);
  }
}