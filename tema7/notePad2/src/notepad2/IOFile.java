/*
 * Clase para controlar el acceso a fichero
 * tanto para escritura como para lectura
 */
package notepad2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Rubén Lahoz Sánchez
 */
public class IOFile {
    
    
    private FileReader leeArchivo;
    String archivo;
    
    public IOFile(String name){
        this.archivo = name;
    }
    
    /**
     * 
     * @param txt   texto a escribir en el archivo
     * @return      true si tiene exito la operación
     */
    public boolean escribeArchivo(String txt){
        try{
            System.out.println(txt);
            BufferedWriter toFile = new BufferedWriter(new FileWriter(archivo));
            toFile.write(txt, 0, txt.length());
            toFile.close();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    
    public String leeArchivo(){
        String txt = "";
        String temp = "";
        try{
        BufferedReader fromFile = new BufferedReader(new FileReader(archivo));
        do{
            temp = fromFile.readLine();
            if(temp != null) txt = txt + temp + "\n";
        }while(temp!= null);
        fromFile.close();
        return txt;
        }catch(Exception e){
            return null;
        }
    }
}
