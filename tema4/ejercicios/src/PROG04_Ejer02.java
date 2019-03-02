/**
 * Programa que determina el número de días de un mes y un año dados
 * @author Lahoz Sánchez Rubén
 * @version	1.0
 */
 
//imports
import java.util.Scanner;

//inicio clase principal
public class PROG04_Ejer02{
	
	//variables globales
	static Scanner teclado = new Scanner(System.in);
	
	//inicio metodo main
	public static void main(String[] argumentos){
	
		System.out.println("Escribir 'exit' para salir.");
		
		//variables locales
		int mes = 0;	//variable para el mes
		int anio = 0;	//variable para el anio
		String cadena;	//Variable para recogida del teclado
		boolean repite;	//para repetir entradas de teclado
	
		do{
			repite = false;
			//pedir el mes
			cadena = pideTexto("Dime un número de mes.");
			
			//Si se introduce exit, salimos del bloque do/while
			if(cadena.toLowerCase().compareTo("exit") == 0) System.exit(0);	
			
			//recogemos la excepción por si no introduce un número
			try{
				mes = Integer.parseInt(cadena);
			}catch(NumberFormatException e){
				System.out.println("Un número entero por favor.");
				repite = true;
			}
		}while((mes>12 || mes < 1) || repite);
		
		
		do{
			repite = false;
		//pedir el año
		cadena = pideTexto("Dime un número de año.");
		
		//Si se introduce exit, salimos del bloque do/while
		if(cadena.toLowerCase().compareTo("exit") == 0) System.exit(0);	
		
		//recogemos la excepción por si no introduce un número
		try{
			anio = Integer.parseInt(cadena);
		}catch(NumberFormatException e){
			System.out.println("Un número entero por favor.");
			repite =true;
		}
	}while(repite);
		
		
	diasMeses(mes, anio);
	System.out.println("Fin de ejecución.");	
	//cierre de main
	}
	/**
	 * Muestra un texto por pantalla y solicita un dato por teclado 
	 * 
	 * @param txt	Texto para mostrar por pantalla
	 * @return 		la cadena de texto introducida por teclado
	 */
	public static String pideTexto(String txt){
		System.out.println(txt);
		return teclado.nextLine();
	}
	
	public static void diasMeses(int m, int a){
		
		//switch del mes
		switch (m) {
		case 1:  System.out.println("El mes tiene 31 días.");
				 break;
		case 2:  if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
					System.out.println("El mes tiene 29 días.");
				  }else{
					System.out.println("El mes tiene 28 días.");
				  }
				  break;	
		case 3:  System.out.println("El mes tiene 31 días");
				 break;
		case 4:  System.out.println("El mes tiene 30 días");
				 break;
		case 5:  System.out.println("El mes tiene 31 días");
				 break;
		case 6:  System.out.println("El mes tiene 30 días");
				 break;
		case 7:  System.out.println("El mes tiene 31 días");
				 break;
		case 8:  System.out.println("El mes tiene 31 días");
				 break;
		case 9:  System.out.println("El mes tiene 30 días");
				 break;
		case 10: System.out.println("El mes tiene 31 días");
				 break;
		case 11: System.out.println("El mes tiene 30 días");
				 break;
		case 12: System.out.println("El mes tiene 31 días");
				 break;
		default: System.out.println("What?? ");
				 break;
		}
	}
	
	
//cierre de clase PROG04_Ejer02
}
