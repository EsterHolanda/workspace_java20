package dados;

public class ContaNormal {
	
	protected int numConta;
	protected String nome;
	protected String cpf;
	protected double saldo;
	
	public ContaNormal(String nome, String cpf, int numConta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numConta = numConta;
		this.saldo = 0;
	}
	
	public String exibirOperacao() {
		String operacao =   "********************************\n"+
							"         EXTRATO PI BANK        \n"+
							"********************************\n"+
							"Cliente: "+nome+"\n"    +
							"Conta  : "+numConta+"\n"+
							"CPF    : "+cpf+"\n"     +
							"Saldo  : R$"+String.format("%.2f",saldo);
		return operacao;
							
	}
	
	public void creditar(double valor) {
		this.saldo = saldo += valor;
	}

	public boolean debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = saldo -= valor;
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

	