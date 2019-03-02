/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viwer;

import javax.swing.JFrame;

/**
 *
 * @author Rubén Lahoz Sánchez
 */
public class Ventana extends JFrame{
    
    BarraAcciones barraAcciones;
    
    public Ventana(){
        //instancia de JFtame
        //JFrame ventana = new JFrame();
        
        //posición y tamaó de inicio
        setBounds(500, 300, 500, 500);
        //acción al cerrar ventana
        
        
        //Instancia la barra de acciones
        
        barraAcciones = new BarraAcciones();
        add(barraAcciones);
        
    }
        
    public BarraAcciones getBarraAcciones(){
        return this.barraAcciones;
    }
}
