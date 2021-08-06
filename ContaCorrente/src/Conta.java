
public class Conta {
	
	int numConta;
	int digito;
	String nome;
	String cpf;
	double saldo;
	
	void exibirInfo() {
		System.out.println("Conta Corrente: " + numConta + "-" + digito);
		System.out.println("Nome do Titular: " + nome);
		System.out.println("CPF do Titular: " + cpf);
		System.out.println("Saldo atual: " + saldo);
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Depósito Realizado: " + valor);
		System.out.println("Saldo Atual: " + saldo);
	}
	
	void sacar(double valor) {
		if (saldo >= valor) {
		saldo = saldo - valor;
		System.out.println("Saque Realizado: " + valor);
		System.out.println("Saldo Atual: " + saldo);
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
	}
	

}
