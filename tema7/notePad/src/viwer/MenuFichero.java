/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viwer;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Rubén Lahoz Sánchez
 */
public class MenuFichero extends JMenu{
    
    JMenuItem nuevo;
    JMenuItem guardar;
    JMenuItem guardarComo;
    
    /**
     * Constructor del menú Fichero
     */
    public MenuFichero(String s){
        super(s);
        //Instanciar opciones
        nuevo = new JMenuItem("Nuevo");
        guardar = new JMenuItem("Guardar");
        guardarComo = new JMenuItem("GuardarComo");
        
        //añadir opciones al menú
        add(nuevo);
        add(guardar);
        add(guardarComo);
    }
    
    public JMenuItem getNuevo(){
        return nuevo;
    }
    
    public JMenuItem getGuardar(){
        return guardar;
    }
    
    public JMenuItem getGuardarComo(){
        return guardarComo;
    }
}
