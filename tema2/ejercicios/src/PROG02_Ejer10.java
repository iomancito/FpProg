public class PROG02_Ejer10{

	public static void main(String[] args){
		float x = 4.5f;
		float y = 3.0f;
		int i = 2;
		float j = i * x;
		System.out.println ("-------Conversiones entre enteros y coma flotante-------");
		System.out.println("Producto de int por float: j = i*x = " + (int) j);
		double dx = 2.0d;
		double dz = dx * y;
		System.out.println("Producto de float por double: dz=dz * y = " + dz);
		
		System.out.println ("-------Operaciones con byte-------");
		byte bx = 5;
		byte by = 2;
		System.out.println ("byte: 5 - 2 = " + (bx - by));
		bx = -128;
		by = 1;
		System.out.println ("byte -128 - 1 = " + (bx + by));
		System.out.println ("(int) -128 - 1 = " + ((int)bx - by));
		
		System.out.println ("-------Operaciones con short-------");
		short sx = 5;
		short sy = 2;
		System.out.println("short: "+sx+" - "+sy+" = " + (sx - sy));
		sx = 32767;
		sy = 1;
		System.out.println("short: " + sx + " +" + sy + "  = " + (short)(sx+sy));
		
		System.out.println ("-------Operaciones con char-------");
		char cx =  '\u000F';
		char cy = '\u0001';
		int z = (int)cx - (int)cy;
		System.out.println("char : " + cx + " - " + cy + " = " +z);
		z = cx - 1;
		System.out.println("char : 0\\000F -1 = " +z);
		cx = '\uFFFF';
		z = cx;
		System.out.println("(int) cx = " + z);
		sx = (short)cx;
		System.out.println("(short) cx = " + sx);
		sx = -32768;
		System.out.println("-32768 (short)(char)(int) = " + (int)(char)sx);
		sx = -1;
		System.out.println("-1 (short)(char)(int) = " + (int)(char)sx);
	}
}
