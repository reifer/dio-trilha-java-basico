package candidatura;

public class ProcessoSeletivo {
	public static void main(String[] args) {

		analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);
	}

	static void analisarCandidato(double pretensaoSalarial) {
		double salariobase = 2000.0;

		if (salariobase > pretensaoSalarial) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salariobase == pretensaoSalarial) {
			System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}