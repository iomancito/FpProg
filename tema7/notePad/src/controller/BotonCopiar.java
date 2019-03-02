/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import viwer.Ventana;

/**
 *
 * @author Rubén Lahoz Sánchez
 */
public class BotonCopiar implements ActionListener{

    JMenuItem copiar;
    
    /**
     * Constructor de controlador para boton copiar
     * @param jmi el boton generado en el viwer par copiar
     */
    public BotonCopiar(JMenuItem jmi){
        this.copiar = jmi;
    }
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
