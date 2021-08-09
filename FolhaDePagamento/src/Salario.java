
public class Salario {
	public static void main(String[] args) {
				
		
	double salario;
	
	Funcionarios f1, f2, f3;
	f1 = new Funcionarios();
	f2 = new Funcionarios();
	f3 = new Funcionarios();
	
	// Funcionarios f1, f2, f3;
	// f1 = new Funcionarios(6654, "Marcela Paive", "marcela@banco.com.br", 3500,00);
	// f2 = new Funcionarios(5433, "Bruno Fernandes", "bruno@banco.com.br", 1600,00);
	// f3 = new Funcionarios(4433, "Bianca Lima", "bianca@banco.com.br", 5000,00);
	
	
	f1.setFuncional(6654);
	f1.setNome("Marcela Paiva");
	f1.setEmail("marcela@banco.com.br");
	f1.setSalario(3500);
	
	f2.setFuncional(5433);
	f2.setNome("Bruno Fernandes");
	f2.setEmail("bruno@banco.com.br");
	f2.setSalario(1600);
	
	f3.setFuncional(4433);
	f3.setNome("Bianca Lima");
	f3.setEmail("bianca@banco.com.br");
	f3.setSalario(5000);
	

	System.out.println("Lista de Funcionários Promovidos Ago/2021");
	System.out.println();
		
	System.out.println(f1.exibir());
	System.out.println();
	System.out.println(f2.exibir());
	System.out.println();
	System.out.println(f3.exibir());
	System.out.println();
		
	f1.reajustarSalario(20);
	f2.reajustarSalario(35);
	f3.reajustarSalario(10);
	
	System.out.println("---------------Após Reajuste-------------------");
	System.out.println(f1.exibir());
	System.out.println();
	System.out.println(f2.exibir());
	System.out.println();
	System.out.println(f3.exibir());
	System.out.println();
	

		
		
	
	}

}
