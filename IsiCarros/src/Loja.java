
public class Loja {
	public static void main(String[] args) {
		// carro � o meu novo tipo de dado
		//c1 e c2 s�o as vari�veis deste novo tipo - chamamos de Objetos
		
		Carro c1;
		Carro c2;
		
		// se fosse um tipo comum, ok.
		// mas como s�o classes precisa solciitar a m�quina virtual um espa�o de mem�ria
		
		c1 = new Carro();
		c2 = new Carro();
		
		// vamos atribuir valores
		
		c1.marca  = "Porsche";
		c1.modelo = "Cayenne";
		c1.ano    = 2021;
		c1.cor    = "Preto";
		c1.preco  = 780000;
		
		c2.marca  = "Chevrolet";
		c2.modelo = "Corsa";
		c2.ano    = 1997;
		c2.cor    = "Prata";
		c2.preco  = 7500;
		
		//vamos exibir o anuncio - podemos usar \n para pular linha - usar entre aspas com sinal de mais ou nova linha de printout
		
		//System.out.println("Autom�vel: "+c1.marca+ " - " +c1.modelo);
		//System.out.println("Ano: "+c1.ano);
		//System.out.println("Cor: "+c1.cor);
		//System.out.println("Pre�o: R$ "+c1.preco + "\n");
		
		//System.out.println("Autom�vel: "+c2.marca+ " - " +c2.modelo);
		//System.out.println("Ano: "+c2.ano);
		//System.out.println("Cor: "+c2.cor);
		//System.out.println("Pre�o: R$ "+c2.preco);
		
		//vamos resumir o c�digo aqui
		
		c1.exibirInfo();
		System.out.println();
		c2.exibirInfo();
		
			
		c1.exibirDesc(10.0);
		c2.exibirDesc(5.0);
		System.out.println("------------");
		
		c1.exibirInfo();
		System.out.println();
		c2.exibirInfo();
		
		System.out.println();
		System.out.println("Valor do IPVA do "+c1.modelo+" = "+c1.calcularIPVA());
		System.out.println("Valor do IPVA do "+c2.modelo+" = "+c2.calcularIPVA());
		
}
}
