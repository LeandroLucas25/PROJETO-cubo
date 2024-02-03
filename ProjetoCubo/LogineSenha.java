package ProjetoCubo;

import java.util.Scanner;

public class LogineSenha {
	public static void main(String[] args) {
        // Declarando as variáveis
       
    	int tentativas = 5;
        String login;
        String senha;

        // Solicitando o login ao usuário
       
        System.out.println("Digite o seu cadastro de login: ");
        Scanner entrada = new Scanner(System.in);
        login = entrada.nextLine();

        // Solicitando a senha ao usuário
      
        do {
            System.out.println("Cadastre a sua senha (É necessário possuir 6 caracteres): ");
            senha = entrada.nextLine();

            // Validando a senha
        
            if (senha.length() != 6) {
                System.out.println("A senha deve ter 6 caracteres.");
            }
        } 
        
        while (senha.length() != 6);

        // Cadastrando o login e a senha
       
        LoginSenha cadastro = new LoginSenha(login, senha);

      
       // Exibindo o cadastro
       
        System.out.println("Seu login foi realizado com sucesso");
        System.out.println("Login: " + cadastro.getLogin());
        System.out.println("Senha: " + ("******"));

        // Exibindo a tela de login
     
        
        do {
            System.out.println("Digite o seu login para entrar no sistema: ");
            login = entrada.nextLine();

            System.out.println("Digite a sua senha para entrar no sistema: ");
            senha = entrada.nextLine();

            if (cadastro.validar(login, senha)) {
                System.out.println("Usuário logado com sucesso.");
                break;
            } else {
                System.out.println("Login ou senha inválidos. " + (tentativas - 1) + " tentativas restantes.");
                tentativas--;
            }
        } while (tentativas > 0);

        if (tentativas == 0) {
            System.out.println("Você excedeu o número de tentativas. Por favor, troque sua senha.");
        }
    }
}

class LoginSenha {

    private String login;
    private String senha;

    public LoginSenha(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validar(String login, String senha) {	
        return this.login.equals(login) && this.senha.equals(senha);
    }
}

