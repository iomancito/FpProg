import java.util.Scanner;
import java.util.LinkedList;
import java.io.*;

/**Clase para la gestión de clientes
 * @author	Lahoz Sánchez Rubén
 * @version	1.0
 */
 
public class AplicacionCliente {
	
	//Estructuda para trabajo en memoria
	private static LinkedList<Cliente> clientes = new LinkedList();
	
	public static void main(String[] args){
		
		boolean salir = false;
		
		//recuperar la información de clientes.dat
		try{
		ObjectInputStream oClientes = new ObjectInputStream(new FileInputStream("clientes.dat"));
		clientes = (LinkedList<Cliente>) oClientes.readObject();
		oClientes.close();
		}catch(Exception e){
			//Si hay excepción, no existe clientes.dat todavía
			System.out.println("Todavía no hay ningún fichero creado.");
		}
		
		
		//bucle del menú
		while(!salir){
			printMenu();
			try{
				int opcion = Integer.parseInt(pideTeclado("Elija una opción:"));
				switch(opcion){
					case 1:
						if(nuevoCliente()) System.out.println("\nCliente añadido");
						else System.out.println("\nCliente ya existe");
						break;
					case 2:
						listarClientes();
						break;
					case 3:
						Cliente c = buscarCliente();
						if(c != null) c.mostrarDatos();
						else System.out.println("\nNif no encontrado.");
						break;
					case 4:
						borrarCliente();
						break;
					case 5:
						eliminarFichero();
						break;
					case 6:
						salir = true;
						break;
				}
			}catch(Exception e){
				System.out.println("Error");
			}
			
		}
	}
	/**
	 * muestra menú por pantalla
	 */
	private static void printMenu(){
		System.out.println("\nMenú");
		System.out.println("1.-Añadir cliente");
		System.out.println("2.-Listar clientes");
		System.out.println("3.-Buscar cliente");
		System.out.println("4.-Borrar cliente");
		System.out.println("5.-Eliminar fichero");
		System.out.println("6.-Salir");
	}
	/**
	 * pide por teclado una cadena de texto
	 * 
	 * @param	txt	texto a mostrar por pantalla
	 * @return	devuelve el dato introducido por pantalla
	 */
	 private static String pideTeclado(String txt){
		 System.out.println(txt);
		 Scanner in = new Scanner(System.in);
		 return in.nextLine();
	 }
	 
	 /**
	 * pide los datos de un cliente
	 * por pantalla y guarda los datos
	 * en el fichero clientes.dat
	 * 
	 */
	 private static boolean nuevoCliente(){
		String n = pideTeclado("\nNIF: ");
		String nom = pideTeclado("Nombre: ");
		int tel = Integer.parseInt(pideTeclado("Teléfono: "));
		String dir = pideTeclado("Dirección: ");
		int deu = Integer.parseInt(pideTeclado("Deuda: "));
		Cliente c = new Cliente(n, nom, tel, dir, deu);
		if(buscarCliente(c) != null) return false;
		clientes.add(c);
		return guardaDatos();
	 }
	 
	 /**
	 * muestra todos los datos de todos los clientes
	 * 
	 * @param	txt	texto a mostrar por pantalla
	 * @return	devuelve el dato introducido por pantalla
	 */
	 private static void listarClientes(){
		 for(Cliente c : clientes){
			 c.mostrarDatos();
		 }
	 }
	 
	 /**
	 * solicita un nif y muestra los datos de dicho 
	 * cliente si hay una coincidencia
	 * 
	 * @param	txt	texto a mostrar por pantalla
	 * @return	devuelve el dato introducido por pantalla
	 */
	 private static Cliente buscarCliente(){
		 String nifBusqueda = pideTeclado("\nNIF a buscar: ");
		 Cliente cb = new Cliente(nifBusqueda);
		 return buscarCliente(cb);
	 }
	 
	 /**
	  * buscar un cliente
	  * @param	c	cliente a buscar
	  */
	 private static Cliente buscarCliente(Cliente cb){
		 for(Cliente c : clientes){
			if(c.equals(cb)){
				return c;
			} 
		 }
		 return null;
	 }
	 
	 /**
	 * pide por teclado una cadena de texto
	 * 
	 * @param	txt	texto a mostrar por pantalla
	 * @return	devuelve el dato introducido por pantalla
	 */
	 private static void borrarCliente(){
		 String nifBusqueda = pideTeclado("\nNIF de cliente a borrar: ");
		 Cliente cb = new Cliente(nifBusqueda);
		 Cliente cBorrar = buscarCliente(cb);
		 if(clientes.remove(cBorrar)){
			  if(guardaDatos())System.out.println("\nCliente eliminado.");
			  else System.out.println("\nError al guardar, cliente no eliminado.");
		 }else System.out.println("\nCliente no encontrado.");
	 }
	 
	 /**
	 * pide por teclado una cadena de texto
	 * 
	 * @param	txt	texto a mostrar por pantalla
	 * @return	devuelve el dato introducido por pantalla
	 */
	 private static void eliminarFichero(){
		 try{
			File f = new File("clientes.dat");
			if(f.exists()) f.delete();
			clientes.clear();
			System.out.println("\nEliminado clientes.dat");
		}catch(Exception e){
			e.printStackTrace();
		}
	 }
	 
	 /**Guarda los datos del clientes en clientes.dat
	  */
	  private static boolean guardaDatos(){
	  try{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("clientes.dat"));
			out.writeObject(clientes);
			out.close();
			return true;
	  }catch(Exception e){
			 return false;
	  }
	 }
}
