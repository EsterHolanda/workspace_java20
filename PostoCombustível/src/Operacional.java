
public class Operacional {
	public static void main(String[] args) {
		
		
		BombaCombustivel c1, c2;
		
		c1 = new BombaCombustivel("Gasolina", 4.20);
		c1.abastecerPorLitro(85.0);
		System.out.println(c1.exibirRecibo());
				
		c2 = new BombaCombustivel("Etanol", 3.80);
		c2.abastacerPorValor(35.00);
		System.out.println(c2.exibirRecibo());	
			

		
	}

}
