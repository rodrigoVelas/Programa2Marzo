/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Lista;
import Vistas.frmNodos;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author umg
 */
public class NodoController implements ActionListener {
    //Levantar el formulario principal
    frmPrincipal VistaPrincipal;
    frmNodos VistaNodos;
    Lista nuevaLista;

    public NodoController(frmPrincipal VistaPrincipal, frmNodos VistaNodos, Lista nuevaLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaNodos = VistaNodos;
        this.nuevaLista = nuevaLista;
        
        //Poner a la escucha los botones
        this.VistaPrincipal.btnAgregarNodo.addActionListener(this);
        
        //Levantar vista principal
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() == this.VistaPrincipal.btnAgregarNodo)
    {
        //Abrir la vista nodos
        //Poner a la escucha los botones de la vista nodos
        this.VistaNodos.btnApilar.addActionListener(this);
        this.VistaNodos.btnEncolar.addActionListener(this);
        //Levantar el formulario vista nodos
        this.VistaNodos.setLocationRelativeTo(null);
        this.VistaNodos.setVisible(true);
        
    }
    if(e.getSource()== this.VistaNodos.btnApilar)
    {
        this.nuevaLista.Apilar(Integer.parseInt(this.VistaNodos.txtDato.getText()));
        this.VistaNodos.txtLista.setText(this.nuevaLista.Listar());
    }
    }
    
}
