import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o 1º número: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o 2º número: ");
        int parametroDois = terminal.nextInt();
        System.out.println("");

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException Exception) {
            System.out.println("O segundo número deve ser maior que o primeiro número.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            System.out.println("O segundo número deve ser maior que o primeiro número.");
        } else {

            int contagem = parametroDois - parametroUm;
            for(int x = 1; x <= contagem; x++){
                System.out.println(x);
            }
        }
    }
}