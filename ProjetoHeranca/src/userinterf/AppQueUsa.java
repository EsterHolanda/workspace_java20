package userinterf;

import core.Estudante;
import core.Pessoa;

public class AppQueUsa {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome  ("Ester");
		p.setEmail ("ester@banco.com.br");
		p.exibir();
		
		Estudante e = new Estudante();
		e.setNumeroMatricula (1234);
		e.setCurso ("Computação");
		e.setNome  ("Pedro");
		e.setEmail ("pedro@escola.com");
		
		e.exibir();
	}

}
