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
        Conjuntos b = new Conjuntos(3);
        Conjuntos c = new Conjuntos(20);
        Conjuntos d = new Conjuntos(5);
        Conjuntos u = new Conjuntos(10);
        Conjuntos x = new Conjuntos(10);
        

        a.insertar(1, 0, 1);
        a.insertar(2, 1, 1);
        a.insertar(3, 2, 1);
        a.insertar(4, 3, 1);
        a.insertar(5, 4, 1);   
        a.Mostrar();
        
        
        
        

        b.insertar(7, 0, 1);
        b.insertar(8, 1, 1);
        b.insertar(9, 2, 1);
        b.Mostrar();
       
        
        
        
        
        c = a.diferSimetrica(b);
        
        c.Mostrar();
        
        
        
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
