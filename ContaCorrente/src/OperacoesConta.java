
public class OperacoesConta {
	public static void main(String[] args) {
		
		Conta titular1;
		Conta titular2;
		
		titular1 = new Conta();
		titular2 = new Conta();
		
		titular1.numConta = 16526;
		titular1.digito   = 2;
		titular1.nome     = "José Americo Oliveira";
		titular1.cpf      = "331.777.823-00";
		titular1.saldo    = 3850.00;
				
		titular2.numConta = 54573;
		titular2.digito   = 4;
		titular2.nome     = "Bárbara Sampaio";
		titular2.cpf      = "240.333.869-42";
		titular2.saldo    = 6734.00;
		
		titular1.exibirInfo();
		System.out.println();
		titular1.depositar(500);
		System.out.println();
		titular1.sacar(300);
		System.out.println();
		
		System.out.println("---------------");
		
		titular2.exibirInfo();
		System.out.println();
		titular2.depositar(100);
		System.out.println();
		titular2.sacar(500);
		System.out.println();

		

		
	}

}
