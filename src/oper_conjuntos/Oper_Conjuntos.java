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
        Conjuntos d = new Conjuntos(5);
        Conjuntos u = new Conjuntos(10);
        Conjuntos x = new Conjuntos(10);
        

        a.insertar(10, 0, 1);
        a.insertar(1, 1, 1);
        a.insertar(2, 2, 1);
        a.insertar(3, 3, 1);
        a.insertar(46556, 4, 1);   
        

        b.insertar(10, 0, 1);
        b.insertar(1, 1, 1);
        b.insertar(2, 2, 1);
        b.insertar(3, 3, 1);
        b.insertar(4, 4, 1);
        b.insertar(3455, 5, 1);
        b.insertar(46556, 6, 1);
           

        d.insertar(10, 4, 1);
        d.insertar(1, 3, 1);
        d.insertar(2, 2, 1);
        d.insertar(3, 1, 1);
        d.insertar(46556, 0, 1);
        d.Mostrar();
        
        d.borrar(10);
        d.borrar(1);
        d.borrar(2);
        d.borrar(3);
        d.borrar(46556);
        
        d.Mostrar();
        
        
        
        
        
        
        
        
        u.insertar(10, 0, 1);
        u.insertar(1, 1, 1);
        u.insertar(2, 2, 1);
        u.insertar(3, 3, 1);
        u.insertar(46556, 4, 1);
        u.insertar(145, 5, 1);
        u.insertar(17, 6, 1);
        u.insertar(28, 7, 1);
        u.insertar(39, 8, 1);
        u.insertar(465356, 9, 1);
        
        
        if(u.pertenece(39)){
            
            System.out.println("el dato 39 esta en la posicion: "+ u.posicion(39));
            
            
            
        }
        
        else{System.out.println("el dato no se encuentra en el conjunto");}
        
        
        
        
        
        
        if(u.subconjuntos(a)){
        System.out.println("conjunto universal: ");
        u.Mostrar();
        System.out.println("conjunto a:");
        a.Mostrar();

        System.out.println("el complemento de a : ");

        x = a.complemento(u);
        x.Mostrar();
        
        }
        
        else{
            System.out.println("no es posible extraer el complemento");
        }

    }

}
