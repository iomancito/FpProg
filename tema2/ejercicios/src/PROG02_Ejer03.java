/**Nombre de clase: Lección2 
 * Autor: Rubén Lahoz Sánchez.
 **/


public class PROG02_Ejer03{
	enum tiposSexo {V, M};
	
	//Inicio función main
	public static void main(String[] args) { 
		
		boolean casado = true;
		final int MAX = 999999;
		byte weekDay =1;
		short yearDay = 288;
		tiposSexo sexo = tiposSexo.M;
		long time = System.currentTimeMillis();
		float totalFactura = 10350.678f;
		long poblacion = 7649292157L;
		
		System.out.println("El valor de la variable casado es " + casado);
		System.out.println("\tEl valor de la variable MAX es " + MAX);
		System.out.println("\tEl valor de la variable weekDay es " + weekDay);
		System.out.println("\tEl valor de la variable yearDay es " + yearDay);		
		System.out.println("\tEl valor de la variable time es " + time);
		System.out.println("\tEl valor de la variable totalFactura es " + totalFactura);
		System.out.println("\tEl valor de la variable poblacion es " + poblacion);
		System.out.println("\tEl valor de la variable sexo es " + sexo);
		
		System.out.print("\nEl valor de la variable casado es " + casado);
		System.out.print("\n\tEl valor de la variable MAX es " + MAX);
		System.out.print("\n\tEl valor de la variable weekDay es " + weekDay);
		System.out.print("\n\tEl valor de la variable yearDay es " + yearDay);		
		System.out.print("\n\tEl valor de la variable time es " + time);
		System.out.print("\n\tEl valor de la variable totalFactura es " + totalFactura);
		System.out.print("\n\tEl valor de la variable poblacion es " + poblacion);
		System.out.print("\n\tEl valor de la variable sexo es " + sexo);
		
		System.out.printf("%n%nEl valor de la variable casado es %b", casado);
		System.out.printf("%n\tEl valor de la variable MAX es %d", MAX);
		System.out.printf("%n\tEl valor de la variable weekDay es %d", weekDay);
		System.out.printf("%n\tEl valor de la variable yearDay es %d", yearDay);		
		System.out.printf("%n\tEl valor de la variable time es %d", time);
		System.out.printf("%n\tEl valor de la variable totalFactura es %f", totalFactura);
		System.out.printf("%n\tEl valor de la variable poblacion es %d", poblacion);
		System.out.printf("%n\tEl valor de la variable sexo es %s", sexo);
		
	//Fin función main
	}
//Cierre clase PROG02_Ejer03
}
