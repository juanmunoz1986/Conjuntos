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
        Conjuntos b = new Conjuntos(7);
        Conjuntos c = new Conjuntos(10);
        System.out.println("el conjunto c esta vacio: " + c.vacio());
        
        
        a.insertar(10, 0, 1);
        a.insertar(1, 1, 1);
        a.insertar(2, 2, 1);
        a.insertar(3, 3, 1);
        a.insertar(4, 4, 1);
        
        b.insertar(10, 0, 1);
        b.insertar(1, 1, 1);
        b.insertar(2, 2, 1);
        b.insertar(3, 3, 1);
        b.insertar(4, 4, 1);
        b.insertar(3455, 5, 1);
        b.insertar(46556, 6, 1);
        
        
        
        
        
        a.Mostrar();               
        b.Mostrar();
        
        c = a.union(b);
        
        
        c.Mostrar();
        
       
        
        
    }
    
}
