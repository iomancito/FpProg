/**
 * Programa que determina el número de días de un mes y un año dados
 * @author Lahoz Sánchez Rubén
 * @version	1.0
 */
 
//imports
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class PROG04_Ejer03{

	//variables globales
	static boolean[] isPrimeArray;	//array de booleanos de numeros primos
	static ArrayList<Integer> factores = new ArrayList<Integer>();	//ArrayList para losfactores
	
	public static void main(String[] args){
		
		//locales
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		
		
		//se solicita el número por teclado
		System.out.println("Dime un número");
		try{
			num = teclado.nextInt();
		}catch(Exception e){
			System.out.println("No es un número");
			System.exit(1);	
		}
		
		//Inicialización de array a true
		isPrimeArray = new boolean[num - 1];
		Arrays.fill(isPrimeArray, true);
			
		//se calculan los primos hasta dicho número
		long start =System.currentTimeMillis();
		for(int i = 2; i <= Math.sqrt(num); i++) if(isPrimeArray[i])cribaEratostenes(i);
		long tiempoPrimos = System.currentTimeMillis() - start;
		System.out.println("Tiempo de criba : " + tiempoPrimos);
		factoresPrimos(num);
		System.out.println("Tiempo de ejecución : " + (System.currentTimeMillis() - start));
		System.out.println("Tiempo de cálculo de factores : " + (System.currentTimeMillis() - start - tiempoPrimos));
		System.out.println("Los factores primos son : ");
		for(Integer n : factores) System.out.println(n);
		
			
	}
	
	/**
	 * Rellena un ArrayList de Integer con los
	 * factores primos de un número n
	 * @param	el número del cual queremos hallar los factores primos
	 */
	public static void factoresPrimos(int n){
		for(int x = 0; x < isPrimeArray.length; x++){
			if(isPrimeArray[x]) {
				while((n % (x+2)) == 0){
					factores.add(new Integer(x+2));
					n = n / (x + 2);
				}
			}
		}
	}
	
	
	/**
	 * genera un array de boolean desde 2 hasta n 
	 * indicando con true aquellos números primos
	 * @param	calcula los primos hasta este número
	 */
	public static void cribaEratostenes(int n){
			
			//locales
			int multiplo;
			int i = 2;
			do{
				multiplo = n * i;
				if(isPrimeArray.length > multiplo - 2) isPrimeArray[multiplo - 2] = false;
				i++;
			}while(multiplo < isPrimeArray.length);
	}

}
