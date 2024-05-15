import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitorDeEntrada = new Scanner(System.in);
        float valorSalario = leitorDeEntrada.nextFloat();
        float valorBeneficios = leitorDeEntrada.nextFloat();

        float valorImposto = 0;
        float salarioBruto = 0;
        if (valorSalario > 0.00 && valorSalario <= 1100.00) {
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario > 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F * valorSalario;
        }else{
            valorImposto = 0.15F * valorSalario;
        }
        //System.out.println("O valor do Imposto cobrado foi de R$" + valorImposto);

        salarioBruto = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", salarioBruto));
    }
}
