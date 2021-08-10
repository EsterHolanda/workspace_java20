package userinterface;

import java.util.ArrayList;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;

public class Pagamentos {
	public static void main(String[] args) {
		
//		Funcionario f1, f2, f3, f4;
//		
//		f1 = new Chefe        (3343, "Nelio Paiva", 6000.00, 950.00, 300.00);
//		f2 = new Comissionado (5467, "Pedro Diniz", 3000.00, 410.00);
//		f3 = new Horista      (7865, "Bruna Ceani", 72, 98.00);
//		f4 = new Empreiteiro  (6234, "Celia Veiga", 4000.00);
//		
//		System.out.println(f1.getNumRegistro()+" - "+f1.getNome()+" - R$ "+f1.calcularSalario());
//		System.out.println(f2.getNumRegistro()+" - "+f2.getNome()+" - R$ "+f2.calcularSalario());
//		System.out.println(f3.getNumRegistro()+" - "+f3.getNome()+" - R$ "+f3.calcularSalario());
//		System.out.println(f4.getNumRegistro()+" - "+f4.getNome()+" - R$ "+f4.calcularSalario());
		
		
//		>> também podemos seguir com o lista de funcionários no exemplo abaixo
//	
//		Funcionario lista[]; - defino que precisa ter uma lista
//
//		
//		lista = new Funcionario [6]; - 6 variaveis, defino o tamanho
//		
//		lista[0] = new Chefe       (1234, "Anne", 10000, 15, 2000);
//		lista[1] = new Horista     (1235, "Vandeco", 200, 79.80);
//		lista[2] = new Comissionado(1236, "Bia", 5000, 17.32);
//		lista[3] = new Horista     (1237, "Yara", 150, 79.80);
//		lista[4] = new Empreiteiro (1238, "Andre", 4850);
//		lista[5] = new Empreiteiro (1239, "Vitor", 3925.72)
//		
//		System.out.println(lista[0].getNumRegistro()+" - "+lista[0].getNome()+" - R$ "+lista[0].calcularSalario());
//		System.out.println(lista[1].getNumRegistro()+" - "+lista[1].getNome()+" - R$ "+lista[1].calcularSalario());
//		System.out.println(lista[2].getNumRegistro()+" - "+lista[2].getNome()+" - R$ "+lista[2].calcularSalario());
//		System.out.println(lista[3].getNumRegistro()+" - "+lista[3].getNome()+" - R$ "+lista[3].calcularSalario());
//		System.out.println(lista[4].getNumRegistro()+" - "+lista[4].getNome()+" - R$ "+lista[4].calcularSalario());
//		System.out.println(lista[5].getNumRegistro()+" - "+lista[5].getNome()+" - R$ "+lista[5].calcularSalario());
		
//		>> ou simplificar tudo com - tb posso usar a palavra "lenght" que sig tamanho
//		 	for (int pos = 0; pos < 6; pos++){
//			System.out.println(lista[pos].getNumRegistro()+" - "+lista[pos].getNome()+" - R$ "+lista[pos].calcularSalario());
//			}
//		
//		>> vetores com colchetes são conjuntos estáticos [] - não consigo redimensionar
//		
		
		ArrayList<Funcionario> lista; //declarei
		lista = new ArrayList<Funcionario>(); //instanciei
		lista.add(new Chefe       (1234, "Anne", 10000, 15, 2000));
		lista.add(new Horista     (1235, "Vandeco", 200, 79.80));
		lista.add(new Comissionado(1236, "Bia", 5000, 17.32));
		lista.add(new Horista     (1237, "Yara", 150, 79.80));
		lista.add(new Empreiteiro (1238, "Andre", 4850));
		lista.add(new Empreiteiro (1239, "Vitor", 3925.72));
		
//		>> existe um segundo tipo de FOR que serve para listas
			for (Funcionario f : lista) {
				System.out.println(f.getNumRegistro()+ " "+f.getNome()+ " R$ "+f.calcularSalario());
			}
		
//		>> vamos fazer do jeitão manual
			System.out.println("---------------------");
			for (int pos = -1; pos >=0; pos--) {
				System.out.println(lista.get(pos).getNumRegistro()+" "+lista.get(pos).getNome()+" R$ "+lista.get(pos).calcularSalario());
			}
		
		
	}

}
