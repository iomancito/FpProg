import java.util.Scanner;

public class PROG02_Ejer08 {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		float n1 = pide_Numero("Dime un número.", teclado);
		float n2 = pide_Numero("Dime otro número.", teclado);
		System.out.println("x + y =" + (n1+n2));
		System.out.println("x - y =" + (n1-n2));
		System.out.println("x * y =" + (n1*n2));
		System.out.println("x / y =" + (n1/n2));
		System.out.println("x ^ 2 =" + Math.pow(n1,2f));
		System.out.println("√ x =" + Math.sqrt(n1));
	
	}
	
	public static float pide_Numero(String texto, Scanner teclado) {
		System.out.println(texto);
		try{
			return teclado.nextFloat();
		}catch(java.util.InputMismatchException e){
			System.out.println("Creo que eso no es un número");
			System.exit(1);
			return 0;
		}
	}
}
