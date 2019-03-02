import java.util.Scanner;

public class PROG03_Ejer01{

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String nombre = pide_Texto("Dime el nombre de la persona", teclado);
		
		Persona p1 = new Persona();
		p1.cambia_Nombre(nombre);
		System.out.println("El nombre de la persona es " + p1.consulta_Nombre());
		
	}
	
	public static String pide_Texto(String texto, Scanner teclado){
		System.out.println(texto);
		return teclado.nextLine();
	}

	public static class Persona{
		String nombre;
		int edad;
		float altura;
		
		String consulta_Nombre(){
			return nombre;
		}
		
		void cambia_Nombre(String nom){
			nombre=nom;
		}
	}
}
