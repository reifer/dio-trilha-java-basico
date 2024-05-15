import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<String> transacoes = new ArrayList<>(); // Lista para armazenar as transações

        for (int i = 0; i < quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao == 'D' || tipoTransacao == 'd') {
                saldo += valorTransacao;
                transacoes.add((i+1) + ". Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S' || tipoTransacao == 's') {
                saldo -= valorTransacao;
                transacoes.add((i+1) + ". Saque de " + valorTransacao);
            } else {
                // Se o tipo de transação não for reconhecido, exibe uma mensagem de erro
                System.out.println("Opcao invalida. Utilize D para deposito ou S para saque.");
                i--; // Volta para a iteração anterior
            }
        }

        // Aqui é exibido o saldo final e a lista de transações ao final do processo:
        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");

        // Exibe cada transação na lista
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }

        // Fechamos o scanner para liberar recursos
        scanner.close();
    }
}