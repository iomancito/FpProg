/**
 * Programa para comprobar si un número dado es par
 * @author Lahoz Sánchez Rubén
 * @version	1.0
 */

//imports
import java.util.Scanner;

//inicio clase principal
public class PROG04_Ejer01{
	
	//inicio metodo main
	public static void main(String[] argumentos){
		System.out.println("Escribir 'exit' para salir.");
		Scanner teclado = new Scanner(System.in);
		String newLine;	//string para la entrada de teclado
		do{
			System.out.println("Dime un número.");
			
			//Pide por teclado 
			newLine = teclado.nextLine();
			
			//Sise introduce exit, salimos del bloque do/while
			if(newLine.toLowerCase().compareTo("exit") == 0) break;	
			
			//recogemos la excepción por si no introduce un número
			try{
				if(Integer.parseInt(newLine)%2 == 0 ) System.out.println("Número par.");
				else System.out.println("Número impar.");
			}catch(NumberFormatException e){
				System.out.println("Un número entero por favor.");
			}
		}while(true);
		System.out.println("Saliendo.");
		
		
	//cierre de main
	}
//cierre de clase PROG04_Ejer01
}
