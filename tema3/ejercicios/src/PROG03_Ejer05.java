

import numeros.Complejo;

public class PROG03_Ejer05{

	public static void main (String[] args){
		

		//constructor con parametros
		System.out.println("Instanciando objeto c1 con parametros");
		Complejo c1 = new Complejo(5.6d, 2.4d);
		
		//constructor sin parametros
		System.out.println("Instanciando objeto c2 sin parametros");
		Complejo c2 = new Complejo();
		
		//visualizar datos de c1 con metodo toString()
		System.out.println("c1 con metodo toString() " + c1.toString());
		
		//visualizar datos de c2 con metodos consulta_Real() y consulta_Imag();
		System.out.println("c2 con metodos consulta_Real()  y constulta_Imag() " + c2.consulta_Real() + "r " + c2.consulta_Imag() + "i");
		
		//metodos para modificar atributos
		System.out.println("Modificando datos de c2");
		c2.cambia_Real(1.1d);
		c2.cambia_Imag(1.1d);
		System.out.println("Nuevos valores de c2 " + c2.toString());
		
		//suma, c1 = c1 + c2
		System.out.println(c1.toString() + " + " + c2.toString());
		c1.sumar(c2);
		System.out.println("Nuevos valores de c1 " + c1.toString());
		
		
	}
}
