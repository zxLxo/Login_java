
import java.util.Scanner;
public class login1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /// Mensagem de boas vindas
        System.out.println("Bem vindo ao nosso site, iremos lhe ajudar a criar sua conta.");

        /// Pede ao usuario os dados para o mesmo criar o seu perfil
        System.out.println("Crie um nome de usuário:");
        String user = scan.nextLine();

        System.out.println("Crie uma senha: ");
        String pass = scan.nextLine();

        System.out.println("Digite seu endereço de email");
        String email = scan.nextLine();

        /// Mensagens de confirmação da criação de conta apos receber os dados
        System.out.println("\n=================================================================================");
        System.out.println("Ótimo, lhe enviamos um email de confirmação para o seguinte endereço: " + email);
        System.out.println("Faça o processo de confirmação para que possamos criar a sua conta, estamos aguardando...");
        System.out.print("Conta criada com sucesso, aperte Enter para ser redirecionado à pagina inicial...");
        scan.nextLine();

        // pede ao usuario seus dados de acesso
        System.out.println("\n======================");
        System.out.println("        LOGIN        ");
        System.out.println("======================");

        System.out.println("Digite seu nome de usuário:");
        String user_auth = scan.nextLine();

        System.out.println("Digite sua senha:");
        String pass_auth = scan.nextLine();

        // Verifica se os dados concedidos estão corretos, e permite ou nao o acesso ao usuario
       System.out.println("\n=================================");
        if (user.equals(user_auth) && pass.equals(pass_auth)) {
            System.out.println("Acesso concedido. Bem vindo!");
        } else {
            System.out.println("Usuário ou senha inválidos. Acesso Negado.");
        
                //fecha o scanner para evitar gasto desnecessario de processamento
            scan.close();

        }
    }
}

