
// já que temos uma classe abtrata não posso dar new em objetos dela
// podem pode utilizar como template-modelo-molde-padrão a aser seguido
// com os requisitos essenciais com o tipo de dados que precisam ter
// alem disso podemos exigir q quem herdar dessa classe, compromete-se a escrever a logica dos 
// métodos definidos, aqui na classe abstrata defini-se o "oq" e nos demais o "como"

public abstract class Veiculo {
	
	String marca;
	String modelo;
	
// aqui definimos o "oq"	
	public abstract void acelerar();
	public abstract void frear();
	

}
