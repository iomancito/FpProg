import java.util.Scanner;
import java.util.InputMismatchException;

public class AplicacionCuentaBancaria{
		
		
	public static void main(String[] args){
		//variables locales
		String nombre;
		String cuenta;
		int saldo = 0;
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		
		//Pedir datos del titular
		do{
			System.out.println("Nombre del titular");
		}while((nombre = teclado.nextLine()).length() > 21);
		
		do{
			System.out.println("Número de cuenta");
		}while(!CuentaBancaria.isValidCcc(cuenta = teclado.nextLine()));
		
		//Crear el objeto CuentaBancaria
		try{
			CuentaBancaria cb = new CuentaBancaria(nombre, cuenta);
			
			//repetir mientras salir = false	
			while(!salir){
				printMenu();
				try{
					//captura la opción desde teclado
					opcion = Integer.parseInt(teclado.nextLine().substring(0));
					//switch para la opción
					switch(opcion){
						case 0:	System.out.println("\nAdiós");
								salir = true;
								break;
						case 1:	System.out.println("\nNúmero de cuenta:");
								System.out.println(cb.getCuentaCompleta());
								break;
						case 2:	System.out.println("\nTitular de la cuenta:");
								System.out.println(cb.getTitular());
								break;
						case 3:	System.out.println("\nCódifo de la entidad:");
								System.out.println(cb.getEntidad());
								break;
						case 4:	System.out.println("\nCódifo de la oficina:");
								System.out.println(cb.getOficina());
								break;
						case 5:	System.out.println("\nNúmero de cuenta:");
								System.out.println(cb.getCuenta());
								break;
						case 6:	System.out.println("\nDígitos de control:");
								System.out.println(cb.getControl());
								break;
						case 7:	System.out.println("\nCantidad a ingresar:");
								try{
									//solicita cantidad a ingresar
									int i = Integer.parseInt(teclado.nextLine());
									//realiza el ingreso
									cb.ingresarDinero(i);
									System.out.println("Saldo actual : "+ cb.getSaldo());
								//recogida de posibles excepciones ingresar dinero
								}catch(InputMismatchException e){
									System.out.println("Eso no es un número.");
									break;
								}catch(IngresoNegativo e){
									System.out.println("No se puede ingresar un número negativo.");
									break;
								}catch(Exception e){
									e.printStackTrace();
									System.out.println("Algo ha ido mal");
									break;
								}
								break;
						case 8:	System.out.println("\nCantidad a retirar:");
								try{
									//solicita cantidad a retirar
									int i = Integer.parseInt(teclado.nextLine());
									//retira el dinero
									cb.retirarDinero(i);
									System.out.println("Saldo actual : "+ cb.getSaldo());
								//captura de excepciones retirar dinero
								}catch(InputMismatchException e){
									System.out.println("Eso no es un número.");
									break;
								}catch(SaldoNegativo e){
									System.out.println("Operación no permitida.\nNo puede tener saldo negativo.");
									break;
								}catch(Exception e){
									e.printStackTrace();
									System.out.println("Algo ha ido mal");
									break;
								}
								break;
						case 9:	System.out.println("\nSu saldo es:");
								System.out.println(cb.getSaldo());
								break;
					}
				//excepciones de opción del menú
				}catch(Exception e){
					//e.printStackTrace();
					System.out.println("Opción no válida");
				}
				
			}
		//excepciones de la creación de cuenta
		}catch (InvalidCcc e){
			System.out.println("Número de cuenta no valido");
			e.printStackTrace();
		}catch (Exception e){
			System.out.println("Algo ha ido mal");
			e.printStackTrace();
		}
		
		
	//fin main
	}

	/**
	 * Muestra el menú principal por pantalla
	 */
	private static void printMenu(){
		System.out.println("\n1. Ver número de cuenta completo");
		System.out.println("2. Ver titular de la cuenta");
		System.out.println("3. Ver código de la entidad");
		System.out.println("4. Ver código de la oficina");
		System.out.println("5. Ver número de cuenta");
		System.out.println("6. Ver dígitos de control");
		System.out.println("7. Realizar ingreso");
		System.out.println("8. Retirar efectivo");
		System.out.println("9. Consultar saldo");
		System.out.println("0. Salir");
	}
//fin clase
}
