
public class Funcionarios {
	
	private int funcional;
	private String nome;
	private String email;
	private double salario;
	
	public String exibir() {
		return "Funcional: "+funcional+" | Nome: "+nome+ " | E-mail: "+email+ " | Salarário Atual: " +salario+ "| Imposto Devido: "+calcularImposto();
	}
	
	public void reajustarSalario(double percentual) {
		salario = salario + salario * percentual/100;
	}
	
	public double calcularImposto() {
		double imposto;
				
		if (salario <= 2000) {
			imposto = 0;
		}
		
		else if (salario > 2000 && salario <= 3000) {
			imposto = salario*0.15;
		}
		
		else if (salario > 3000 && salario <= 4500) {
			imposto = salario*0.25;
        }

        else {
        	imposto = 2250;
		}
		
		return imposto;
	}
	
		public int getFuncional() {
			return funcional;
		}

		public void setFuncional(int funcional) {
			this.funcional = funcional;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		
}
