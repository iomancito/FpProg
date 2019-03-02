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
public class MenuEdicion extends JMenu{
    /**
     * Constructor del menú Fichero
     */
    public MenuEdicion(String s){
        super(s);
        //Instanciar opciones
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem pegar = new JMenuItem("Pegar");
        
        //añadir opciones al menú
        add(cortar);
        add(copiar);
        add(pegar);
    }
}
