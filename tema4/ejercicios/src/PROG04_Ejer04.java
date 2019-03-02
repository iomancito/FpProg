import java.util.Scanner;

/**
 * Programa que de solución al problema planteado
 * en el supuesto 4
 * @author Lahoz Sánchez Rubén
 * @version	1.0
 */
//Inicio de clase
public class PROG04_Ejer04{
	
	static Scanner teclado = new Scanner(System.in);		
	
	//Inicio de main
	public static void main(String[] args){
		String nombre = entradaTeclado("Dime tu nombre");
		int edad = 0;
		
		try{
			edad = Integer.parseInt(entradaTeclado("Dime tu edad"));
		}catch(NumberFormatException e){
			System.out.println("Eso no es un número.");
		}catch(Exception e){
			System.out.println("Algo raro ha ocurrido");
			e.printStackTrace();
		}
		
		System.out.println(nombre + ", dentro de una década tendrás : " + (edad+10) + " años");
		if(edad < 26) System.out.println("Perteneces a la clase A");
		else if(edad < 51) System.out.println("Perteneces a la clase B");
		else System.out.println("Perteneces a la clase C");
	//fin de main
	}
	
	/**
	 * Devuelve un dato introducido por teclado
	 * tras presentar un texo por pantalla
	 * @param	txt el texto a mostrar por pantalla
	 * @return	String del dato introducido por teclado
	 * */
	public static String entradaTeclado(String txt){
		System.out.println(txt);
		return teclado.nextLine();
	}
//fin de clase
}
