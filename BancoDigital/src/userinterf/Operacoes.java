package userinterf;

import dados.ContaEspecial;
import dados.ContaNormal;

public class Operacoes {
	public static void main(String[] args) {
		
		ContaNormal cn, ce;
		
		cn = new ContaNormal("Paulo Neto", "558.887.776-90", 2256);
		ce = new ContaEspecial("Bento Silva", "443.445.665-78", 9878, 200.00);
		
			
		System.out.println(cn.exibirOperacao());
		cn.creditar(300);
		System.out.println(cn.exibirOperacao());
		if (cn.debitar(200)) {
			System.out.println("Débito Efetivado");
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
		System.out.println(cn.exibirOperacao());
		
		System.out.println("-------------------------------------");
		
		//----------------------------------------------------
			
		
		System.out.println(ce.exibirOperacao());
		ce.creditar(30);
		System.out.println(ce.exibirOperacao());
		if (ce.debitar(200)) {
		System.out.println("Débito Efetivado");
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
		System.out.println(ce.exibirOperacao());
		
		
	}

}
