
public class Carro {
 //vamos apenas declarar as variaveis que compoe o tipo de carro

	String marca;
	String modelo;
	int	   ano;
	String cor;
	double preco;
	
	//agora precisamos criar trechos de c�digo (subrotinas) para manipular, exibir, alterar essas variaveis
	
	void exibirInfo() {
		System.out.println("Autom�vel: " + marca + " - " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Cor: " + cor);
		System.out.println("Pre�o: R$ "+ preco);
	}
	
	//funcionalidade que altera o valor do produto, podendo ser diferente para cada objeto
	
	void exibirDesc(double percentual) {
		preco = preco - preco * percentual/100;
		}
	
	//agora uma funcionalidade que retorne o valor do IPVA do carro baseado no seu pre�o
	
	//tipo nome
	//� uma funcionalidade q retorna o valor de ipva
	
	double calcularIPVA() {
		double valoripva;
		if(ano < 2000) {
			valoripva = 0.0;
		}
		else {
			valoripva = preco * 0.02;
		}
		return valoripva;
	
	}
}
