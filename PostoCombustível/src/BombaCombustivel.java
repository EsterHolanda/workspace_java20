
public class BombaCombustivel {
	
	private String nomeCombustivel;
	private double precoLitro;
	private double qtdeLitro;
	private double totalPagar;
	
	//construtor
	 public BombaCombustivel (String nomeCombustivel, double precoLitro) {
	 this.nomeCombustivel = nomeCombustivel;
	 this.precoLitro = precoLitro;
	 }
	 
	//métodos
	public String exibirRecibo() {
		String recibo = "************************************************\n"+
						"           IsidroCorp Gas & Energy              \n"+ 
						"************************************************\n"+
						"Combustível :    " + nomeCombustivel + "\n"+
						"Preço Litro : R$ " + String.format("%.3f\n", precoLitro) + 
						"Quantidade  :    " + String.format("%.3f\n", qtdeLitro ) +
						"Valor Total : R$ " + String.format("%.2f\n", totalPagar);
				
		return recibo;
	}
	
	
	public void abastecerPorLitro (double qtdeLitro) {
		this.qtdeLitro = qtdeLitro;
		totalPagar = qtdeLitro * precoLitro;		
	}
	
	public void abastacerPorValor (double total) {
		this.totalPagar = total;
		this.qtdeLitro = this.totalPagar / this.precoLitro;
	}
	
	
	public String getNomeCombustivel() {
		return nomeCombustivel;
	}
	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdeLitro() {
		return qtdeLitro;
	}
	public void setQtdeLitro(double qtdeLitro) {
		this.qtdeLitro = qtdeLitro;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	
	

}
