import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassePrincipal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a,b,r;
		
		try {
		
			System.out.println("Digite um valor:");
			a = teclado.nextInt();
			
			System.out.println("Digite outro valor:");
			b = teclado.nextInt();
			r = a/b;
			
			System.out.println("O resultado vale "+r);
			
			teclado.close();
		}
		
		catch (InputMismatchException e) {
			System.out.println("Favor digitar um número");
		}
		
		catch (ArithmeticException e) {
			System.out.println("Favor informar um número inteiro");
		}
		
		catch (Exception e){
			System.out.println("Ops...deu ruim");
			System.out.println("tipo de erro = "+e.getClass().getName());
		}
	
	
	}

}
