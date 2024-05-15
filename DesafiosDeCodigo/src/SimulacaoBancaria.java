
/*Descrição
Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas.
A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma
conta bancária virtual.

Entrada
O programa exibirá um menu com as seguintes opções:

1) Depositar
2) Sacar
3) Consultar Saldo
4) Encerrar
O usuário escolherá uma dessas opções digitando o número correspondente.

Saída
Utilizando um switch, o programa realizará a operação escolhida pelo usuário.

Se o usuário escolher:

1: O programa solicitará o valor a ser depositado e atualizará o saldo.
2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente.
3: O programa exibirá o saldo atual da conta.
0: O programa encerrará.
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
1 = 50
2 = 100
0	
Saldo atual: 50.0
Saldo insuficiente.
Programa encerrado.
3 = 1
550 
0	Saldo atual: 0.0
Saldo atual: 550.0
Programa encerrado.
1
1000
2
500
0	Saldo atual: 1000.0
Saldo atual: 500.0
Programa encerrado. */
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        while (true) {
            exibirMenu();

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("Digite o valor do deposito R$");
                    float deposito = scanner.nextFloat();
                    saldo += deposito;
                    break;
                }
                case 2: {
                    System.out.println("Digite o valor do saque R$");
                    float saque = scanner.nextFloat();
                    if (saque > saldo) {
                        System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                        System.out.println("Saldo insuficiente.");
                        continue;
                    } else
                        saldo -= saque;
                    System.out.println("o valor atual do saldo é R$" + saldo);
                    break;
                }
                case 3: {
                    System.out.println("Saldo atual é: " + saldo);
                    break;
                }
                case 0: {
                    System.out.println("Programa encerrado");
                    return;
                }
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    // break;
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("MENU:");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("0 - Encerrar");
    }
}