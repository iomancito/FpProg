import java.util.Scanner;

public class PROG03_Ejer04{

	public static void main(String[] args){
		//Scanner teclado = new Scanner(System.in);
		//String nombre = pide_Texto("Dime el nombre de la persona", teclado);
		
		Persona p1 = new Persona("Blas", 23, 1.64f);
		System.out.println("El nombre de la persona es " + p1.consulta_Nombre());
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
		
		public Persona(){
			this.nombre = "Luisa Perez";
			this.edad = 22;
			this.altura = 1.7f;
		}
		
		public Persona(String n, int e, float a){
			this.nombre = n;
			this.edad = e;
			this.altura = a;
		}
		
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
