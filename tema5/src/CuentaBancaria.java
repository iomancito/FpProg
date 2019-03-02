import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**Clase para la gestión de una cuenta bancaria
 * @author	Lahoz Sánchez Rubén
 * @version	1.0
 */

public class CuentaBancaria{

	String titular;
	String ccc;
	int saldo ;
	
	/**
	 * Constructor de objeto cuenta bancaria
	 * @param	t	titular de la cuenta
	 * @param	c	número de cuenta
	 * @param	s	saldo en la cuenta
	 */
	public CuentaBancaria(String t, String c, int s) throws CccException{
		if(t.length() > 20) throw new CccException("Demasiados caracteres en el titular.");
		else if (!this.isValidCcc(c)) throw new InvalidCcc("El número de cuenta no es válido.");
		else {
			this.titular = t;
			this.ccc = c;
			this.saldo = s;
		} 
	}
	
	/**
	 * Constructor de objeto cuenta bancaria
	 * @param	t	titular de la cuenta
	 * @param	c	número de cuenta
	 */
	public CuentaBancaria(String t, String c) throws CccException{
		if(t.length() > 20) throw new CccException("Demasiados caracteres en el titular.");
		else if (!this.isValidCcc(c)) throw new InvalidCcc("El número de cuenta no es válido.");
		else {
			this.titular = t;
			this.ccc = c;
			this.saldo = 0;
		} 
	}
	
	/**
	 * Metodo para retirar una cantidad
	 * @param	m	cantidad a modificar
	 * 
	 */
	public void retirarDinero(int m) throws CccException{
		if (m < 0) throw new CccException("No se puede retirar cantidad negativa.");
		else if ((this.saldo - m) >= 0) this.saldo = this.saldo - m;
		else throw new SaldoNegativo("No dispone de saldo suficiente");
	}
	
	/**
	 * Metodo para ingresar una cantidad
	 * @param	m	cantidad a modificar
	 * 
	 */
	public void ingresarDinero(int m) throws IngresoNegativo{
		if (m >= 0) this.saldo = this.saldo + m;
		else throw new IngresoNegativo("No se puede ingresar una cantidad negativa.");
	}
	
	/**
	 * Devuelve el saldo actual de la cuenta
	 * @return	el saldo de la cuenta
	 */
	public int getSaldo(){
		return this.saldo;
	}
	
	/**
	 * Devuelve el titular de la cuenta
	 * @return	el titular de la cuenta
	 */
	public String getTitular(){
		return this.titular;
	}
	
		/**
	 * Devuelve el número de la cuenta completo
	 * @return	el número de la cuenta
	 */
	public String getCuentaCompleta(){
		return this.ccc;
	}
	/**
	 * devuelve el número de cuenta
	 * @return	el número de cuenta
	 */
	public String getCuenta(){
		return this.ccc.substring(10,20);
	}
	
	/**
	 * devuelve el número de entidad de la cuenta
	 * @return	el número de entidad
	 */
	public String getEntidad(){
		return this.ccc.substring(0,4);
	}
	
	/**
	 * devuelve el número de oficina de la cuenta
	 * @return	el número de oficina
	 */
	public String getOficina(){
		return this.ccc.substring(4,8);
	}
	
	/**
	 * devuelve el código de control de la cuenta
	 * @return	el código de control
	 */
	public String getControl(){
		return this.ccc.substring(8,10);
	}
	
	/**
	 * metodo para comprobar la validez de un número de cuenta dado
	 * @param	cuenta	el número de cuenta a comprobar
	 * @return	true si es válido, false en caso contrario
	 */
	public static boolean isValidCcc(String cuenta){
		//System.out.println("Cuenta del Banco "+cuenta);
	 
		//Comprueba que el número de cuenta tiene 20 digitos
		Pattern cuentaPattern = Pattern.compile("\\d{20}");
		Matcher m = cuentaPattern.matcher(cuenta);
		if(m.matches()){
			//System.out.println("cuenta cumple el patrón (20 dígitos)");
	 
			
			String banco = "00"+cuenta.substring(0,8);
			//System.out.println("Banco (con 00) "+banco);
			
			//Genera primer dígito de control
			int suma = Integer.parseInt(banco.substring(0,1))*1+
				Integer.parseInt(banco.substring(1,2))*2+
				Integer.parseInt(banco.substring(2,3))*4+
				Integer.parseInt(banco.substring(3,4))*8+
				Integer.parseInt(banco.substring(4,5))*5+
				Integer.parseInt(banco.substring(5,6))*10+
				Integer.parseInt(banco.substring(6,7))*9+
				Integer.parseInt(banco.substring(7,8))*7+
				Integer.parseInt(banco.substring(8,9))*3+
				Integer.parseInt(banco.substring(9,10))*6;
	 
			int control= 11 - (suma%11);
			//System.out.println("control banco después del modulo 11 "+control);
			if (control==10)
				control=1;
			else if (control==11)
				control=0;
	 
			//System.out.println("control "+control );
	 
			int controlBanco = Integer.parseInt(cuenta.substring(8,9));
			if (controlBanco!=control)
				return false;
			//System.out.println("El control del banco está bien");
	 
			//System.out.println("cuenta "+cuenta.substring(10,20));
	 
			//genera segundo dígito de control
			suma = Integer.parseInt(cuenta.substring(10,11))*1+
				Integer.parseInt(cuenta.substring(11,12))*2+
				Integer.parseInt(cuenta.substring(12,13))*4+
				Integer.parseInt(cuenta.substring(13,14))*8+
				Integer.parseInt(cuenta.substring(14,15))*5+
				Integer.parseInt(cuenta.substring(15,16))*10+
				Integer.parseInt(cuenta.substring(16,17))*9+
				Integer.parseInt(cuenta.substring(17,18))*7+
				Integer.parseInt(cuenta.substring(18,19))*3+
				Integer.parseInt(cuenta.substring(19,20))*6;
	 
			control= 11 - (suma%11);
			//System.out.println("control cuenta después del modulo 11 "+control);
			if (control==10)
				control=1;
			else if (control==11)
				control=0;
	 
			//System.out.println("control "+control);
	 
			int controlcuenta = Integer.parseInt(cuenta.substring(9,10));
			if (controlcuenta!=control)
				return false;
			else
				return true;
	 
		}
		else
			return false;
	}
//Fin clase CuentaBancaria
}

/**
 * clase excepción para la cuenta bancaria
 */
class CccException extends Exception{
	public CccException(String msg){
		super(msg);
	}
}
/**
 * clase excepción para la cuenta bancaria
 * con saldo negativo
 */
class SaldoNegativo extends CccException{
	public SaldoNegativo(String msg){
		super(msg);
	}
}
/**
 * clase excepción para la cuenta bancaria
 * con ingreso de importe negativo
 */
class IngresoNegativo extends CccException{
	public IngresoNegativo(String msg){
		super(msg);
	}
}
/**
 * clase excepción para la cuenta bancaria
 * número de cuenta invalido
 */
class InvalidCcc extends CccException{
	public InvalidCcc(String msg){
		super(msg);
	}
}
