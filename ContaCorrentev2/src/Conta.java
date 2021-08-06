
public class Conta {

	// como encapsulo? usando o private (blindagem)
	private int numConta;
	private int digito;
	private String nome;
	private String cpf;
	private double saldo;

	public String exibir() {
		return "Conta" + numConta + "/" + digito + "\n" + "Titular: " + nome + "(" + cpf + ")" + "\n" + "Saldo: R$ "
				+ saldo;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public boolean sacar(double valor) { // antes usava o void - mas isso não é recomendável
		saldo = saldo - valor;
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;

	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
