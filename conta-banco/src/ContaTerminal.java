import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para nossos usuários
        //Obter pela classe scanner os valores  digitados no terminal
        //Exibir mensagem da conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor digite o número da Agencia bancária: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da Conta bancária: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o valor do seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +" , conta de número " + numero + " e seu saldo é " +saldo + " e já está disponível para saque.");
    }
}
