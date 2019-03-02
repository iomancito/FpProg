import java.util.Scanner;

public class PROG02_Ejer09 {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		int n1 = pide_Numero("Dime un número de 5 digitos.", teclado);
		System.out.print(n1/10000 + " "); n1 = n1 - (n1 / 10000) * 10000;
		System.out.print(n1/1000 + " "); n1 = n1 - (n1 / 1000) * 1000;
		System.out.print(n1/100 + " "); n1 = n1 - (n1 / 100) * 100;
		System.out.print(n1/10 + " "); n1 = n1 - (n1 / 10) * 10;
		System.out.print(n1);
	}
	
	public static int pide_Numero(String texto, Scanner teclado) {
		System.out.println(texto);
		String numero = teclado.nextLine();
		if(numero.length() == 5){
			try{
				return Integer.parseInt(numero);
			}catch(Exception e){
				System.out.println("Creo que eso no es un número entero de cinco digitos");
				System.exit(1);
				return 0;
			}
		}
		System.out.println("Esto no tiene 5 digitos.");
		System.exit(-1);
		return 0;
	}
}
