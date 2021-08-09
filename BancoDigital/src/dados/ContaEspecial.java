package dados;

public class ContaEspecial extends ContaNormal{
	protected double limite;
	
	public ContaEspecial(String nome, String cpf, int numConta, double limite) {
		super(nome, cpf, numConta);
		this.limite = limite;
	}
	
	public String exibirOperacao() {
		String operacao =   "********************************\n"+
							"         EXTRATO PI BANK       \n"+
							"********************************\n"+
							"Cliente: "+nome+"\n"    +
							"Conta  : "+numConta+"\n"+
							"CPF    : "+cpf+"\n"     +
							"Saldo  : R$"+String.format("%.2f",saldo)+"\n"+
							"Limite : R$"+String.format("%.2f",limite);
		
		return operacao;
	}
	
	public boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo = super.saldo - valor;
			return true;
		}
		return false;
	}
	

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
