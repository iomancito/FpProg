import java.util.Scanner;

public class PROG02_Ejer07 {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		float c1 = pide_Numero("Dime un número para c1.", teclado);
		float c2 = pide_Numero("Dime un número para c2.", teclado);
		System.out.println("f(x) = c1 * x + c2");
		//si c1 = 0, es una paralela al eje x y si c2 = 0, no corta el eje x nunca.
		if(c1 == 0 && c2 != 0) System.out.println("f(x) no tiene raiz.");
		//si c1 y c2 son 0, es paralela al eje x con y = 0.
		else if(c1 == 0 && c2 == 0) System.out.println("La raiz de f(x) es 0.");
		//resto de casos es una función lineal de pendiente c1
		else System.out.println("La raiz de f(x) es " + -c2/c1);
	
	}
	
	public static float pide_Numero(String texto, Scanner teclado) {
		System.out.println(texto);
		try{
			return teclado.nextFloat();
		}catch(java.util.InputMismatchException e){
			System.out.println("Creo que eso no es un número");
			System.exit(-1);
			return 0;
		}
	}
}
