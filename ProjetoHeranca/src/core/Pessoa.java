package core;

public class Pessoa {
	protected String nome; //neste caso n�o preciso usar o "get" para exibir na classe estudante, por exemplo (protected)
	protected String email;
	
	public void exibir( ) {
		System.out.println("Pessoa: "+nome+ "/"+email);
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

}
