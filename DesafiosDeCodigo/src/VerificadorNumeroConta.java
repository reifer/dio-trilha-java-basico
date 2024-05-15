/*Descrição
Você está desenvolvendo um programa simples em Java para verificar se um número de conta bancária é válido. O número da conta deve ter exatamente 8 dígitos.

Entrada
O programa solicitará ao usuário que digite o número da conta bancária.
Saída
O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos.
Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, IllegalArgumentException) e informará que o número da conta é inválido.
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
01020304	Numero de conta valido.
1234568	Erro: Numero de conta invalido. Digite exatamente 8 digitos.
3231	Erro: Numero de conta invalido. Digite exatamente 8 digitos. */
import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Inicialize um bloco try-catch para capturar exceções:
        // TODO: Leia a entrada do usuário como uma string representando o número da
        // conta:
        // TODO: Chame o método verificarNumeroConta, passando o número da conta como
        // argumento:

        try {
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        } finally {
            scanner.close();
        }
    }

    // Imprime que o número de conta é válido:
    // System.out.println("Numero de conta valido.");

    // TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser
    // lançada pelo método verificarNumeroConta:

    // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à
    // exceção:

    /*
     * catch (IllegalArgumentException e){
     * System.out.println("Erro: " + e.getMessage());
     * } finally {
     * scanner.close();
     * }
     * }
     */

    //}

    // Declaração do método verificarNumeroConta, que verifica se o número de conta
    // tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }

        // TODO: Verifique se o número da conta tem exatamente 8 dígitos:
        // TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número
        // de conta não tenha 8 dígitos:

    }
}