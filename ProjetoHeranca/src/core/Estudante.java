package core;

// para ler corretamente: a classe Estudante amplia a defini��o da classe Pessoa
// sig que em estudante tem tudo o que tem em Pessoa e mais o que quiser adicionar

public class Estudante extends Pessoa{
	private int numeroMatricula;
	private String curso;
	
	public void exibir() {											//n�o precisa mudar pq est� dentro da mesma classe
		System.out.println("Estudante: "+nome+"/"+email+"/"+numeroMatricula+"/"+curso);
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	

}
