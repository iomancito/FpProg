/**
 * Programa que determina el número de días de un mes y un año dados
 * @author Lahoz Sánchez Rubén
 * @version	1.0
 */
 
//imports
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ConThread{

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
		
		//se dimensiona el array de booleans y se rellena con ceros
		isPrimeArray = new boolean[num - 1];
		Arrays.fill(isPrimeArray, true);
		
		long start = System.currentTimeMillis();
		//se calculan los primos hasta dicho número
		CribaEratostenes c1;
		CribaEratostenes c2;
		CribaEratostenes c3;
		CribaEratostenes c4;
		for(int i = 2; i <= Math.sqrt(num); i++){
			
			if(isPrimeArray[i]){
				c1 = new CribaEratostenes(i);
				c1.start();
			}
			i++;
			
			if(isPrimeArray[i]){
				c2 = new CribaEratostenes(i);
				c2.start();
			}	
			i++;
			
			if(isPrimeArray[i]){
				c3 = new CribaEratostenes(i);
				c3.start();
			}
			i++;
			
			if(isPrimeArray[i]){
				c4 = new CribaEratostenes(i);
				c4.start();
			}
			i++;
		}	
		
		System.out.println("Tiempo de criba : " + (System.currentTimeMillis() - start));
		
		//for(boolean b: isPrimeArray) System.out.println(b);
		factoresPrimos(num);
		System.out.println("Tiempo de ejecución : " + (System.currentTimeMillis() - start));
		
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
	 * clase que llena el array de boolean desde 2 hasta n 
	 * indicando con true aquellos números primos
	 * 
	 */
	public static class CribaEratostenes extends Thread{
	
		//locales
		int multiplo;
		int i = 2;
		int num;

		//constructor de la clase
		public CribaEratostenes(int n){
			this.num = n;
		}
		
		public void run(){
			//System.out.println(this.num);
			do{
				this.multiplo = this.num * this.i;			
				if(isPrimeArray.length > this.multiplo - 2) isPrimeArray[multiplo - 2] = false;
				this.i++;
			}while(this.multiplo < isPrimeArray.length);
		}
	}

}
