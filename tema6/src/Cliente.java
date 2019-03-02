import java.io.Serializable;

/**Clase para la gestión de clientes
 * @author	Lahoz Sánchez Rubén
 * @version	1.0
 */

public class Cliente implements Serializable{

	private String nif;
	private String nombre;
	private int telefono;
	private String direccion;
	private int deuda;

	/**
	 * Constructor de objeto Cliente con deuda dada
	 * @param	n	nif del cliente
	 * @param	nom	nombre del cliente
	 * @param	tel	teléfono del clieten
	 * @param	dir	dirección del cliente
	 * @param	deu	deuda del cliente
	 */
	Cliente(String n, String nom, int tel, String dir, int deu){
		this.nif = n;
		this.nombre = nom;
		this.telefono = tel;
		this.direccion = dir;
		this.deuda = deu;
	}
	
	/**
	 * Constructor de objeto Cliente con deuda cero
	 * @param	n	nif del cliente
	 * @param	nom	nombre del cliente
	 * @param	tel	teléfono del clieten
	 * @param	dir	dirección del cliente
	 */
	Cliente(String n, String nom, int tel, String dir){
		this.nif = n;
		this.nombre = nom;
		this.telefono = tel;
		this.direccion = dir;
		this.deuda = 0;
	}
	
	/**
	 * Constructor de objeto Cliente para búsquedas
	 * con únicamente el nif como parametro
	 * @param	n	nif a buscar
	 */
	Cliente(String n){
		this.nif = n;
	}
	
	/**
	 * Devuelve nif del cliente
	 */
	public String getNif(){
		return this.nif;
	}
		
	/**
	 * Devuelve nombre del cliente
	 */
	public String getNombre(){
		return this.nombre;
	}
		
	/**
	 * Devuelve tel del cliente
	 */
	public int getTelefono(){
		return this.telefono;
	}
		
	/**
	 * Devuelve nif del cliente
	 */
	public String getDireccion(){
		return this.direccion;
	}
		
	/**
	 * Devuelve nif del cliente
	 */
	public int getDeuda(){
		return this.deuda;
	}
		
	/**
	 * Actualiza nif del cliente
	 */
	public void setNif(String n){
		this.nif = n;
	}
		
	/**
	 * Actualiza nombre del cliente
	 */
	public void setNombre(String n){
		this.nombre = n;
	}
		
	/**
	 * Actualiza tel del cliente
	 */
	public void setTelefono(int t){
		this.telefono = t;
	}
		
	/**
	 * Actualiza nif del cliente
	 */
	public void setDireccion(String d){
		this.direccion = d;
	}
		
	/**
	 * Actualiza nif del cliente
	 */
	public void setDeuda(int d){
		this.deuda = d;
	}
	
	/**
	 * muestra por pantalla los datos del cliente
	 */
	 public void mostrarDatos(){
		 System.out.println("\nNIF: " + this.getNif());
		 System.out.println("Nombre: " + this.nombre);
		 System.out.println("Telefono: " + this.telefono);
		 System.out.println("Dirección: " + this.direccion);
		 System.out.println("Deuda: " + this.deuda);
	 }
	
	/**
	 * sobreescribe el metodo equals para la comparación
	 * de objetos tipo Cliente por medio de la comprobación 
	 * de sus NIF
	 */
	@Override
	public boolean equals(Object o){
		if(o == this)return true;
		if(!(o instanceof Cliente)) return false;
		Cliente c = (Cliente) o;
		return (this.getNif().toUpperCase().compareTo(c.getNif().toUpperCase()) == 0);
		
	}
	
}
