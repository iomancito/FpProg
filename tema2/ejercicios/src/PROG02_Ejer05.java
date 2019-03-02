import java.util.Scanner;

public class PROG02_Ejer05{
	
	public static void main(String[] args){
		Scanner teclado = new Scanner (System.in);
		int num1 = pide_Numero("Dime un número entero", teclado);
		int num2 = pide_Numero("Dime otro número entero", teclado);
		if(num1%num2 == 0) System.out.println(num1 + " sí es múltiplo de " + num2 + " y su cociente es " + num1/num2 + ".");
		else System.out.println(num1 + " no es múltiplo de " + num2 +".");
	}
	
	public static int pide_Numero(String texto, Scanner teclado) {
		System.out.println(texto);
		try{
			return teclado.nextInt();
		}catch(java.util.InputMismatchException e){
			System.out.println("Creo que eso no es un número entero");
			System.exit(1);
			return 0;
		}
	}
}
