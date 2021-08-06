import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	int opcao;
	double valor;
	
	Conta c1;
	c1 = new Conta();
	c1.setNumConta(1232);
	c1.setDigito(6);
	c1.setNome("Brenda Silva");
	c1.setCpf("123.456.789-55");
	c1.setSaldo(500.00);
	
	// agora vem o menu
	
	do {
		System.out.println("Bem Vindo ao IsiTaú - Seu banco na NET");
		System.out.println("Digite 1-Info / 2-Depósito / 3-Saque / 0-Encerrar");
		opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println(c1.exibir());
			break;
			
		case 2:
			System.out.println("[DEPÓSITO] Digite o valor:");
			valor = teclado.nextDouble();
			c1.depositar(valor);
			break;
			
		case 3:
			System.out.println("[SAQUE] Digite o valor:");
			valor = teclado.nextDouble();
			if (c1.sacar(valor)) {
				System.out.println("Saque Autorizado");
			}
			else {
				System.out.println("Saldo Insuficiente");
			}
			break;
			
		case 0:
			System.out.println("---> Obrigado pela preferência!");
			break;
			
		default:
			System.out.println("Erro: Opção Inválida");
		}
		
	} while (opcao != 0);
	
	teclado.close();	
	}
}
