
/*Descrição
Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma
conta bancária. O cliente pode fazer saques até atingir um limite diário predefinido.

Entrada
O programa solicitará ao usuário que informe o limite diário de saque.
Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.

Saída
Utilizando um laço for, o programa iterará sobre os saques.
Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop.
Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
1500
430
0	Saque realizado. Limite restante: 1070.0
Transacoes encerradas.
500

1500	Limite diario de saque atingido. Transacoes encerradas.
80
40
0	Saque realizado. Limite restante: 40.0
Transacoes encerradas. */
import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saque = scanner.nextDouble();

        // TODO: Crie um loop 'for' para iterar sobre os saques:
        for (int i = 1; i < saque; i++) {
            double proximoSaque = saque;
            if (saque == 0 || proximoSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (limiteDiario >= saque) {
                limiteDiario = limiteDiario - saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            }
            proximoSaque = scanner.nextDouble();
        }

        // TODO: Solicite ao usuário o valor do saque:

        // TODO: Verifique se o valor do saque é zero, encerrando as transações:
        // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o
        // limiteDiario;

        // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor
        // do saque do limite diário:

        // TODO: Informe que o saque foi realizado e mostre o limite restante:

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();

    }

}