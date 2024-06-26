package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo3 {
	public static void main(String[] args) {
		imprimirSelecionados();
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos em ordem de seleção pelo índice");
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
		}
	}
	
	static void selecaoCandidatos() {
		// Array com a lista de candidatos
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou o valor de salário R$" + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	
	// Método que simula o valor pretendido
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salariobase = 2000.0;

		if (salariobase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salariobase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}