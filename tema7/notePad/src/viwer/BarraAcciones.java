/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viwer;

import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JPanel;



/**
 *
 * @author Rubán Lahoz Sánchez
 */
public class BarraAcciones extends JPanel{
    
    MenuFichero menuFichero;
    MenuEdicion menuEdicion;
    /**
     * constructor de la barra de acciones
     */
    public BarraAcciones(){
        
        JMenuBar menuBar = new JMenuBar();
        
        
        menuFichero = new MenuFichero("Fichero");
        menuEdicion = new MenuEdicion("Edición");
        menuBar.add(menuFichero);
        menuBar.add(menuEdicion);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(menuBar);
        
    }
    
    public MenuFichero getMenuFichero(){
        return this.menuFichero;
    }
    
    public MenuEdicion getMenuEdicion(){
        return this.menuEdicion;
    }
}
