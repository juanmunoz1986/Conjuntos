/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oper_conjuntos;

/**
 *
 * @author juano
 */
public class Oper_Conjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Conjuntos a = new Conjuntos(5);
        Conjuntos b = new Conjuntos(5);
        
        a.insertar(10, 0, 1);
        a.insertar(1, 1, 1);
        a.insertar(2, 2, 1);
        a.insertar(3, 3, 1);
        a.insertar(4, 4, 1);
        
        b.insertar(10, 0, 1);
        b.insertar(1, 1, 1);
        b.insertar(34, 2, 1);
        b.insertar(344, 3, 1);
        b.insertar(4, 4, 1);
        
        a.Mostrar();
        b.Mostrar();
        
        a.union(b);
       
        
        
        
        
        
    }
    
}
