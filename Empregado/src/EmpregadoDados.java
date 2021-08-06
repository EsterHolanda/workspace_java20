
	public class EmpregadoDados {
		public static void main(String[] args) {
	
	EmpregadoTeste pessoa1;
	EmpregadoTeste pessoa2;
		
	pessoa1 = new EmpregadoTeste();
	pessoa2 = new EmpregadoTeste();
	
	pessoa1.nome    = "Margarida";
	pessoa1.cargo   = "Analista Jr";
	pessoa1.salario = 1000;
	
	pessoa2.nome    = "Leticia";
	pessoa2.cargo   = "Tecnico";
	pessoa2.salario = 500;
	
	
	pessoa1.exibirInfo();
	System.out.println(); // para pular linha
	pessoa2.exibirInfo();
	
	System.out.println("-------------------------------");
	
	pessoa1.aumentarSalario(5.0);
	System.out.println();
	pessoa2.aumentarSalario(10);
	
	System.out.println("Depois do aumento de Salário");
	System.out.println();
	pessoa1.exibirInfo();
	System.out.println(); // para pular linha
	pessoa2.exibirInfo();
	
	}	
}
