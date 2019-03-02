package numeros;

public class Complejo{
	double real;
	double imag;
	
	//Constructor a cero
	public Complejo(){
		this.real = 0d;
		this.imag = 0d;
	}
	
	//Constructor por parametros
	public Complejo(double r, double i){
		this.real = r;
		this.imag = i;
	}
	
	//Devuelve la parte real
	public double consulta_Real(){
		return this.real;
	}
	
	//Devuelve la parte imaginaria
	public double consulta_Imag(){
		return this.imag;
	}
	
	//Asigna valor a la parte real
	public void cambia_Real(double r){
		this.real = r;
	}
	
	//Asigna valor a la parte imaginaria
	public void cambia_Imag(double i){
		this.imag = i;
	}
	
	//Devuelve un String con el valor del número complejo
	public String toString(){
		return Double.toString(this.real) + "r " + Double.toString(this.imag) + "i";
	}
	
	//Suma suma este complejo con otro dado por parametro
	public void sumar(Complejo c){
		System.out.println("Sumando c2 a c1");
		this.real = this.real + c.consulta_Real();
		this.imag = this.imag + c.consulta_Imag();
	}
}
