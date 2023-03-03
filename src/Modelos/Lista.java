/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class Lista {
  Nodo primero;
  Nodo Auxiliar;
  String cadena = "";
  
public void Apilar()
{
    
}  

public void Apilar(int dato)
{
    Nodo nuevoNodo = new Nodo(dato);
    if(primero == null)
    {
        primero = nuevoNodo;
    }
    else
    {
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
    }
    JOptionPane.showMessageDialog(null, "Nodo APILADO");
}

public String Listar()
{
  Auxiliar = primero;
while(Auxiliar!=null)
{
    cadena = cadena + Auxiliar.getDato();
    Auxiliar = Auxiliar.siguiente;
}
return cadena;
}
}
