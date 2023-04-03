/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oper_conjuntos;

/**
 *
 * @author juano
 */
public class Nodo_conjuntos {
    
    private Nodo_conjuntos Liga;
    private int dato;
    
  public Nodo_conjuntos(int dato){
      
    this.Liga = null;
    this.dato = dato;
      
  }  

    public Nodo_conjuntos getLiga() {
        return Liga;
    }

    public void setLiga(Nodo_conjuntos Liga) {
        this.Liga = Liga;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
   
  
  
    
    
    
    
}
