import java.util.Scanner;

public class PROG03_Ejer02{

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String nombre = pide_Texto("Dime el nombre de la persona", teclado);
		
		Persona p1 = new Persona();
		p1.cambia_Nombre(nombre);
		System.out.println("El nombre de la persona es " + p1.consulta_Nombre());
		p1.set_Edad(30);
		p1.set_Altura(1.70f);
		System.out.println("La persona tiene " + p1.get_Edad() + " años");
		System.out.println("La persona mide " + p1.get_Altura() + " metros");
		
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
		public void set_Edad(int edad){
			this.edad = edad;
		}
		public int get_Edad(){
			return this.edad;
		}
		public void set_Altura(float altura){
			this.altura = altura;
		}
		public float get_Altura(){
			return this.altura;
		}
	}
}
