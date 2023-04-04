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
        Conjuntos c = new Conjuntos(5);
        
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
        
        c = a.union(b);
        
        c.Mostrar();
        
        System.out.println("el conjunto a tiene: " + a.cantidadElementos() + " elementos");   
        System.out.println("el conjunto b tiene: " + b.cantidadElementos() + " elementos"); 
        System.out.println("el conjunto c tiene: " + c.cantidadElementos() + " elementos"); 

        
        System.out.println("el conjunto a "+ c.subconjuntos(a)+" es un sub conjunto de c");
        System.out.println("el conjunto b "+ c.subconjuntos(b)+" es un sub conjunto de c");
        System.out.println("el conjunto a "+ a.subconjuntos(b)+" es un sub conjunto de b");
        System.out.println("el conjunto b "+ b.subconjuntos(a)+" es un sub conjunto de a");
        System.out.println("el conjunto c "+ a.subconjuntos(c)+" es un sub conjunto de c");
        
        
        
    }
    
}
