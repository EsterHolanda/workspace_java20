
public class EmpregadoTeste {

	String nome;
	String cargo;
	double salario;

	void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: " + salario);
	}

	void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
	}

}
