public class PROG02_Ejer06{

	public enum meses {Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio,Agosto, Septiembre, Octubre, Noviembre, Diciembre};
	
	public static void main(String[] arg){
		
		
		meses m = meses.Marzo;
		System.out.println(m);
		
		m = meses.valueOf ("Abril");
		System.out.println(m);
		
		
	}
}
